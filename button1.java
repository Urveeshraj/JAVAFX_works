import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class button1 extends Application{
    public void start(Stage primarystage){
        StackPane root=new StackPane();
        Button btn=new Button("Button1");
        Scene obj=new Scene(root,300,200);
        root.getChildren().add(btn);
        primarystage.setScene(obj);
        primarystage.setTitle("Button Example");
        primarystage.show();}
    public static void main(String[] args) {launch(args);}}