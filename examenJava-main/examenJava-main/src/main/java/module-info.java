module com.mycompany.examenjava {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.examenjava to javafx.fxml;
    exports com.mycompany.examenjava;
}
