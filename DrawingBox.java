/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;

/**
 *
 * @author Tariye Peter
 */
public class DrawingBoxes extends Application {

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {

        Pane pane = new Pane();
        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 300, 400);
        primaryStage.setTitle("Box"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

        // Create Rectangle
        Rectangle r1 = new Rectangle(0, 10, 50, 50);
        Rectangle r2 = new Rectangle(10, 20, 50, 50);
        Rectangle r3 = new Rectangle(20, 50, 50, 50);
        Rectangle r4 = new Rectangle(100, 100, 50, 50);
        Rectangle r5 = new Rectangle(208, 150, 50, 50);
        Rectangle r6 = new Rectangle(238, 200, 50, 50);

        r1.setFill(Color.AQUA);
        r2.setFill(Color.BLUE);
        r3.setFill(Color.RED);
        r4.setFill(Color.BROWN);
        r5.setFill(Color.GREEN);
        r6.setFill(Color.PURPLE);

        pane.getChildren().add(r1);
        pane.getChildren().add(r2);
        pane.getChildren().add(r3);
        pane.getChildren().add(r4);
        pane.getChildren().add(r5);
        pane.getChildren().add(r6);

    }

    public Rectangle createRec() {

        return null;
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
