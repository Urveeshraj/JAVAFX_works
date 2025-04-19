import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class button2 extends Application{
    public void start(Stage primaryStage){
        StackPane root = new StackPane();
        Button b = new Button("Button");
        Scene s = new Scene(root,100,100); 
        root.getChildren().add(b);
        primaryStage.setScene(s);
        primaryStage.setTitle("Button");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}

