package sides;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import services_infra.AdditionImpl;

public class GrpcServer {
public static void main(String[] args) {
	try {
		
		Server server = ServerBuilder.forPort(3000).
				addService(new AdditionImpl()).
				build();
				
		server.start();
		System.out.println("Welcome ,server is waiting you ... ");
		
		server.awaitTermination();
	} catch (IOException | InterruptedException ex) {
		ex.printStackTrace();
	}
}
}
