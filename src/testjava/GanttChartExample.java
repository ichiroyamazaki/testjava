package testjava;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GanttChartExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        double width = 100; // Width of each block
        double height = 20; // Height of each block

        // Create the blocks for the Gantt chart
        Rectangle p1 = new Rectangle(0, 50, width, height);
        Text t1 = new Text(10, 65, "P1");
        Rectangle p3 = new Rectangle(width, 50, width, height);
        Text t3 = new Text(width + 10, 65, "P3");
        Rectangle p4 = new Rectangle(width * 2, 50, width, height);
        Text t4 = new Text(width * 2 + 10, 65, "P4");
        Rectangle p2 = new Rectangle(width * 3, 50, width, height);
        Text t2 = new Text(width * 3 + 10, 65, "P2");
        Rectangle p5 = new Rectangle(width * 4, 50, width, height);
        Text t5 = new Text(width * 4 + 10, 65, "P5");

        // Add all elements to the root
        root.getChildren().addAll(p1, t1, p3, t3, p4, t4, p2, t2, p5, t5);

        // Create a scene and add it to the stage
        Scene scene = new Scene(root, width * 5, 150);
        primaryStage.setTitle("Gantt Chart");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
