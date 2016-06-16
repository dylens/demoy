package fory.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class A extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        final Label label = new Label("Hello JavaFX!");
        label.setFont(new Font(100));

        Button yellow = new Button("Yellow");
        yellow.setOnAction(event -> label.setTextFill(Color.YELLOW));

        Scene scene = new Scene(label);
        primaryStage.setScene(scene);
        primaryStage.setTitle("hello");
        primaryStage.show();
    }
}
