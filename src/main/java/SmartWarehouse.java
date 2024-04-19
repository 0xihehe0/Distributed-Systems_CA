import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SmartWarehouse extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Main layout pane
        BorderPane borderPane = new BorderPane();

        // Left layout with vertical box, centered
        VBox leftBox = new VBox(10); // 10 is the spacing between elements
        leftBox.setAlignment(Pos.CENTER); // Center the contents vertically and horizontally
        leftBox.getChildren().add(new Label("Left Content"));
        leftBox.getChildren().add(new Button("Left Button"));
        borderPane.setLeft(leftBox); // Set this layout to the left side of the BorderPane

        // Center layout with vertical box, centered
        VBox centerBox = new VBox(10); // 10 is the spacing between elements
        centerBox.setAlignment(Pos.CENTER); // Center the contents vertically and horizontally
        centerBox.getChildren().add(new Label("Center Content"));
        centerBox.getChildren().add(new Button("Center Button"));
        borderPane.setCenter(centerBox); // Set this layout to the center of the BorderPane

        // Right layout with vertical box, centered
        VBox rightBox = new VBox(10); // 10 is the spacing between elements
        rightBox.setAlignment(Pos.CENTER); // Center the contents vertically and horizontally
        rightBox.getChildren().add(new Label("Right Content"));
        rightBox.getChildren().add(new Button("Right Button"));
        borderPane.setRight(rightBox); // Set this layout to the right side of the BorderPane

        // Set the scene
        Scene scene = new Scene(borderPane, 800, 600);
        primaryStage.setTitle("Smart Warehouse");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
