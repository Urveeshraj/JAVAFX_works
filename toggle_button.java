import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class toggle_button extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        ToggleButton btn1 = new ToggleButton("Urveesh");
        ToggleButton btn2 = new ToggleButton("Ayush");
        ToggleButton btn3 = new ToggleButton("Swaraj");
                ToggleButton btn4 = new ToggleButton("Gaurav");

        ToggleGroup group = new ToggleGroup();
        btn1.setToggleGroup(group);
        btn2.setToggleGroup(group);
        btn3.setToggleGroup(group);
        btn4.setToggleGroup(group);
        VBox box = new VBox(6);
        box.setFillWidth(false);
        box.setPadding(new Insets(5, 5, 5, 20));
        box.getChildren().addAll(btn1, btn2, btn3,btn4);
        Scene scene = new Scene(box, 600, 180, Color.RED);
        primaryStage.setScene(scene);
        primaryStage.setTitle("My Roommates");
        primaryStage.show();
    }
}
