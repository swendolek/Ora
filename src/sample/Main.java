package sample;

import javafx.application.Application;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.stage.*;

public class Main extends Application {

    String windowTitle = "Ora";
    Button but;


    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle(windowTitle);

        but = new Button();
        but.setText("Ha butt");



    }


    public static void main(String[] args) {
        launch(args);
    }
}
