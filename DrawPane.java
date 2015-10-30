/*
 * Drawing a pane
 */

/**
 *
 * @author Xuanyi Zhu
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import javafx.stage.Stage;

public class DrawPane extends Application{
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 600, 800);
        primaryStage.setTitle("Krakout");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
