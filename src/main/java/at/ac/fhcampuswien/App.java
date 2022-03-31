package at.ac.fhcampuswien;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage primarystage) throws IOException{
        FXMLLoader root = new FXMLLoader(App.class.getResource("NewsApp.fxml"));
        Scene scene = new Scene(root.load(), 558, 402);
        primarystage.setScene(scene);
        primarystage.setResizable(false);
        primarystage.show();
    }
    public static void main(String[] args) {
        launch();
        /*
        Menu menu = new Menu();
        menu.start();
        */

    }
}