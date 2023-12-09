import grpc
import operation_pb2
import operation_pb2_grpc

channel = grpc.insecure_channel('localhost:3000')
stub = operation_pb2_grpc.OperationsStub(channel)

while True:
    print("------Welcome-------")
    print("Select operation:")
    print("1. Addition")
    print("2. Subtraction")
    print("3. Multiplication")
    print("4. Division")
    print("5. Distance")
    op = int(input("Select: "))

    if op != 5:
        a = int(input("A = "))
        b = int(input("B = "))
        request = operation_pb2.Operands(a=a, b=b) # type: ignore
        if op == 1:
            result = stub.add(request)
            print(f"{a} + {b} = {result.res}")
        elif op == 2:
            result = stub.substract(request)
            print(f"{a} - {b} = {result.res}")
        elif op == 3:
            result = stub.multip(request)
            print(f"{a} * {b} = {result.res}")
        elif op == 4:
            result = stub.divide(request)
            print(f"{a} / {b} = {result.res}")
    else:
        P1x = int(input("P1x = "))
        P1y = int(input("P1y = "))
        P2x = int(input("P2x = "))
        P2y = int(input("P2y = "))
        p1 = operation_pb2.Point(x=P1x, y=P1y) # type: ignore
        p2 = operation_pb2.Point(x=P2x, y=P2y) # type: ignore
        pointsRequest = operation_pb2.Points(p1=p1, p2=p2) # type: ignore
        result = stub.distace(pointsRequest)
        print(f"Distance between P1({P1x},{P1y}) and P2({P2x},{P2y}) is {result.res}")
