import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class radioButton extends Application{
    public static void main(String[] args) {
        launch(args);
    }public void start(Stage primaryStage) throws Exception{
        ToggleGroup group = new ToggleGroup();
        RadioButton r1=new RadioButton("1");
        RadioButton r2=new RadioButton("2");
        RadioButton r3=new RadioButton("3");
        RadioButton r4=new RadioButton("4");
        r1.setToggleGroup(group);
        r2.setToggleGroup(group);
        r3.setToggleGroup(group);
        r4.setToggleGroup(group);
        
        VBox root = new VBox();
        root.setSpacing(10);
        root.getChildren().addAll(r1,r2,r3,r4);
        Scene s = new Scene (root,500,500);
        primaryStage.setScene(s);
        primaryStage.setTitle("Radio Buttons");
        primaryStage.show();
    }
}
