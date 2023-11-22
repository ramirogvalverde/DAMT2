module es.iesaugusto.mavenproject1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens es.iesaugusto.mavenproject1 to javafx.fxml;
    exports es.iesaugusto.mavenproject1;
}
