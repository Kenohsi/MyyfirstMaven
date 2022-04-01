module at.ac.fhcampuswien {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens at.ac.fhcampuswien to javafx.fxml;
    exports at.ac.fhcampuswien;
}