package com.company.company;

import company.Hello;
import company.HelloWorldServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {
    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
            .usePlaintext() // Insecure mode, use SSL/TLS in production
            .build();

    public void run(String args) {
        // Create a gRPC stub for the service
        HelloWorldServiceGrpc.HelloWorldServiceBlockingStub stub = HelloWorldServiceGrpc.newBlockingStub(channel);

        // Create a request
        Hello.HelloRequest request = Hello.HelloRequest.newBuilder()
                .setText(args)
                .build();

        // Call the gRPC service
        Hello.HelloResponse response = stub.hello(request);

        // Print the response
        System.out.println("Server Response: " + response.getText());

    }


}
