
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.application.Application;

public class checkbox extends Application{
    public void start(Stage primarystage) throws Exception {
        Label L = new Label("Multiple choices");
        CheckBox C1 = new CheckBox("Option 1");
        CheckBox C2 = new CheckBox("Option 2");
        CheckBox C3 = new CheckBox("Option 3");
        CheckBox C4 = new CheckBox("Option 4");
        HBox root = new HBox();
        root.getChildren().addAll(L, C1, C2, C3, C4);
        root.setSpacing(5);
        Scene scene=new Scene(root,800,200);
        primarystage.setScene(scene);
        primarystage.setTitle("Quiz");
        primarystage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
