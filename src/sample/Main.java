package sample;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    String windowTitle = "Ora";
    Button but;

    ArrayList<Node> objects = new ArrayList<Node>();


    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle(windowTitle);

        but = new Button();
        but.setText("Ha butt");

        StackPane lay = new StackPane();
        lay.getChildren().add(but);
    }


    public static void main(String[] args) {
        launch(args);
    }

}
