package services.remote;

import io.grpc.stub.StreamObserver;
import ressources.java.dz.example.grpc.Operands;
import ressources.java.dz.example.grpc.Points;
import ressources.java.dz.example.grpc.Result;
import ressources.java.dz.example.grpc.OperationsGrpc.OperationsImplBase;

public class OperationsGrpcService extends OperationsImplBase {
    @Override
    public void add(Operands request, StreamObserver<Result> responseObserver) {
        // TODO Auto-generated method stub
    
        int result = request.getA() + request.getB();
        Result response = Result.newBuilder().setRes(result).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    public void substract(Operands request, StreamObserver<Result> responseObserver) {
        // TODO Auto-generated method stub
        int result = request.getA() - request.getB();
        Result response = Result.newBuilder().setRes(result).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    public void multip(Operands request, StreamObserver<Result> responseObserver) {
        // TODO Auto-generated method stub
        float result = request.getA() * request.getB();
        Result response = Result.newBuilder().setRes(result).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    public void divide(Operands request, StreamObserver<Result> responseObserver) {
        Result response;
        // TODO Auto-generated method stub
        if (request.getA() == 0 || request.getB() == 0) {

            response = Result.newBuilder().setRes(0).build();
        } else {
            float result = (float)request.getA() / (float)request.getB();
            response = Result.newBuilder().setRes(result).build();
        }
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void distace(Points request, StreamObserver<Result> responseObserver) {
        // TODO Auto-generated method stub
        float result = (float) Math.sqrt(
                Math.pow((float) (request.getP1().getX() - request.getP2().getX()), 2)
                        + Math.pow((float) (request.getP1().getY() - request.getP2().getY()), 2));
        Result response = Result.newBuilder().setRes(result).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }


}