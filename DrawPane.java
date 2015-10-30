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
    static final int PANE_X_DIM = 600;
    static final int PANE_Y_DIM = 800;
    Pane pane;
    private Scene scene;
    
    @Override
    public void start(Stage primaryStage) {
        pane = new Pane();
        scene = new Scene(pane, PANE_X_DIM, PANE_Y_DIM);
        primaryStage.setTitle("Krakout");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}

