module com.company.company {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.rmi;
    requires io.grpc;
    requires protobuf.java;
    requires io.grpc.stub;
    requires io.grpc.protobuf;
    requires com.google.common;
    requires java.annotation;
    requires org.apache.httpcomponents.httpcore;
    requires org.apache.httpcomponents.httpclient;

    opens com.company.company to javafx.fxml;
    exports com.company.company;
}