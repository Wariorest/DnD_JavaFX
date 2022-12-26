module com.dnd.dnd {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;


    opens com.dnd.dnd to javafx.fxml;
    exports com.dnd.dnd;
}