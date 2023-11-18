package services_infra;

import io.grpc.stub.StreamObserver;
import services.AdditionGrpc.AdditionImplBase;
import services.Operands;
import services.Result;

public class AdditionImpl extends AdditionImplBase {

	@Override
	public void add(Operands request, StreamObserver<Result> responseObserver) {
		// TODO Auto-generated method stub
		int result = request.getA()+request.getB();
		Result response=Result.newBuilder().setSum(result).build();				
		
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

}
