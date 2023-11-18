package sides;

import java.util.Scanner;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import services.AdditionGrpc;
import services.Operands;
import services.Result;

public class GrpcClient {
	public static void main(String[] args) {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 3000).usePlaintext().build();

		AdditionGrpc.AdditionBlockingStub stub = AdditionGrpc.newBlockingStub(channel);

		Scanner sc = new Scanner(System.in);
		System.out.println("A = ");
		int a = sc.nextInt();
		System.out.println("B = ");
		int b = sc.nextInt();
		sc.close();
		Operands request = Operands.newBuilder().setA(a).setB(b).build();

		Result result = stub.add(request);
		System.out.println(a + " + " + b + " = " + result.getSum());

		channel.shutdown();
	}
}
