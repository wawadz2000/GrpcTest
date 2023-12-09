package sides;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import services.remote.OperationsGrpcService;

public class server {
    public static void main(String[] args) {
        try {

            Server server = ServerBuilder.forPort(3000).addService(new OperationsGrpcService()).build();

            server.start();
            System.out.println("Welcome ,server is waiting you ... ");

            server.awaitTermination();
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
