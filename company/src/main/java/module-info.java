module com.company.company {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.company.company to javafx.fxml;
    exports com.company.company;
}