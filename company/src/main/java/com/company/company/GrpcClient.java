package com.company.company;

import company.Hello;
import company.HelloWorldServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {
    public static void main(String[] args) {
        // Create a gRPC channel to connect to the server
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext() // Insecure mode, use SSL/TLS in production
                .build();

        // Create a gRPC stub for the service
        HelloWorldServiceGrpc.HelloWorldServiceBlockingStub stub = HelloWorldServiceGrpc.newBlockingStub(channel);

        // Create a request
        Hello.HelloRequest request = Hello.HelloRequest.newBuilder()
                .setText("Hello")
                .build();

        // Call the gRPC service
        Hello.HelloResponse response = stub.hello(request);

        // Print the response
        System.out.println("Server Response: " + response.getText());

        // Shutdown the channel when done
        channel.shutdown();
    }
}
