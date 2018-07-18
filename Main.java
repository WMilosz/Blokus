package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    private sample.Application app;

    @Override
    public void start(Stage primaryStage) throws Exception{

        GridPane gridPane = new GridPane();
        Pane mainPane = new Pane(gridPane);
        Button overButton = new Button("End");
        overButton.setVisible(true);
        overButton.setLayoutX(650);
        overButton.setLayoutY(700);
        overButton.setPrefSize(70,20);
        overButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });

        mainPane.getChildren().add(overButton);

        gridPane.setLayoutX(60);
        gridPane.setLayoutY(60);
        mainPane.setPrefSize(800,800);

        //creating scene
        Scene scene = new Scene(mainPane);
        primaryStage.setScene(scene);
        primaryStage.show();

        //application start
        app = new sample.Application(scene, gridPane);


    }

    public static void main(String[] args) {
        launch(args);
    }
}
