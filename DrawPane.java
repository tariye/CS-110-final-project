/*
 * Drawing a pane
 */

/**
 *
 * @author Xuanyi Zhu
 */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public abstract class DrawPane extends Application {

    static final int PANE_X_DIM = 600;
    static final int PANE_Y_DIM = 800;
    Pane pane;
    private Scene scene;
    Line line;

    /**
     * @return the PANE_X_DIM
     */
    public static int getPANE_X_DIM() {
        return PANE_X_DIM;
    }

    /**
     * @return the PANE_Y_DIM
     */
    public static int getPANE_Y_DIM() {
        return PANE_Y_DIM;
    }

    /**
     * draw a pane and set background color by input a color
     *
     * @param backgroundColor
     */
    public DrawPane(Color backgroundColor) {
        pane = new Pane();
        BackgroundFill myBF = new BackgroundFill(backgroundColor, new CornerRadii(1),
                new Insets(0.0, 0.0, 0.0, 0.0));// or null for the padding
        pane.setBackground(new Background(myBF));
        scene = new Scene(pane, PANE_X_DIM, PANE_Y_DIM);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Krakout");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
