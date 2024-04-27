import com.ncirl.Warehouse;
import com.ncirl.Weather;
import com.ncirl.WeatherArrayListReader;
import com.ncirl.WarehouseArrayListReader;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class SmartWarehouse extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Setup the main layout pane
        BorderPane borderPane = new BorderPane();

        // Get the weather and warehouse data
        ArrayList<Weather> weatherData = WeatherArrayListReader.getWeather();
        ArrayList<Warehouse> warehouseData = WarehouseArrayListReader.getWarehouseData();

        // Set up the top, center, and bottom panes
        borderPane.setTop(setupTopPane(weatherData));
        borderPane.setCenter(setupCenterPane(warehouseData));
        borderPane.setBottom(setupBottomPane(warehouseData)); // If you have more data to show

        // Set the scene and show the stage
        Scene scene = new Scene(borderPane, 800, 600);
        primaryStage.setTitle("Smart Warehouse");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private VBox setupTopPane(ArrayList<Weather> weatherData) {
        VBox topBox = new VBox(10);
        topBox.setAlignment(Pos.CENTER);

        // Initialize the weather data label and display all weather readings
        StringBuilder weatherText = new StringBuilder("Weather Data:\n");
        for (Weather weather : weatherData) {
            weatherText.append(weather.toString()).append("\n");
        }
        Label weatherLabel = new Label(weatherText.toString());
        topBox.getChildren().add(weatherLabel);

        return topBox;
    }

    private VBox setupCenterPane(ArrayList<Warehouse> warehouseData) {
        VBox centerBox = new VBox(10);
        centerBox.setAlignment(Pos.CENTER);

        // Initialize the warehouse data label and display all warehouse readings
        StringBuilder warehouseText = new StringBuilder("Warehouse Data:\n");
        for (Warehouse ware : warehouseData) {
            warehouseText.append(ware.toString()).append("\n");
        }
        Label warehouseLabel = new Label(warehouseText.toString());
        centerBox.getChildren().add(warehouseLabel);

        return centerBox;
    }

    private VBox setupBottomPane(ArrayList<Warehouse> warehouseData) {
        VBox bottomBox = new VBox(10);
        bottomBox.setAlignment(Pos.CENTER);
        StringBuilder warehouseText = new StringBuilder("Warehouse Data:\n");
        for (Warehouse ware : warehouseData) {
            warehouseText.append(ware.toString()).append("\n");
        }
        Label warehouseLabel = new Label(warehouseText.toString());
        bottomBox.getChildren().add(warehouseLabel);

        return bottomBox;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
