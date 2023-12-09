package sides;

import java.util.Scanner;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import ressources.java.dz.example.grpc.Operands;
import ressources.java.dz.example.grpc.OperationsGrpc;
import ressources.java.dz.example.grpc.Point;
import ressources.java.dz.example.grpc.Points;
import ressources.java.dz.example.grpc.Result;

public class Client {
    public static void main(String[] args) {
        try {

            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
            Result result;
            OperationsGrpc.OperationsBlockingStub stub = OperationsGrpc.newBlockingStub(channel);
            while (true) {

                Scanner sc = new Scanner(System.in);
                System.out.println("------Welcome-------");
                System.out.println("select operation: ");
                System.out.println("addition: 1");
                System.out.println("substraction: 2 ");
                System.out.println("multiplication: 3");
                System.out.println("division: 4");
                System.out.println("distance: 5");
                System.out.println("Select: ");
                int op = sc.nextInt();
                if (op != 5) {
                    System.out.println("A = ");
                    int a = sc.nextInt();
                    System.out.println("B = ");
                    int b = sc.nextInt();
                    Operands request = Operands.newBuilder().setA(a).setB(b).build();
                    switch (op) {
                        case 1:
                            result = stub.add(request);
                            System.out.println(a + " + " + b + " = " + result.getRes());
                            break;
                        case 2:
                            result = stub.substract(request);
                            System.out.println(a + " - " + b + " = " + result.getRes());
                            break;
                        case 3:
                            result = stub.multip(request);
                            System.out.println(a + " * " + b + " = " + result.getRes());
                            break;
                        case 4:
                            result = stub.divide(request);
                            System.out.println(a + " / " + b + " = " + result.getRes());
                            break;
                    }
                } else {
                    System.out.println("P1x = ");
                    int P1x = sc.nextInt();
                    System.out.println("P1y = ");
                    int P1y = sc.nextInt();
                    System.out.println("P2x = ");
                    int P2x = sc.nextInt();
                    System.out.println("P2y = ");
                    int P2y = sc.nextInt();
                    Point p1 = Point.newBuilder().setX(P1x).setY(P1y).build();
                    Point p2 = Point.newBuilder().setX(P2x).setY(P2y).build();
                    Points pointsRequest = Points.newBuilder().setP1(p1).setP2(p2).build();
                    result = stub.distace(pointsRequest);
                    System.out.println("distance between P1("+P1x+","+P1y+")"+" and "+"P2("+P2x+","+P2y+")"+" is " +result.getRes());
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
