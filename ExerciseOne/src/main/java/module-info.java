module com.example.exerasixc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires org.testng;


    opens at.ac.fhcampuswien to javafx.fxml;
    exports at.ac.fhcampuswien;
}