//22BCE8084
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

class Test2 extends Application{
    public void start (Stage primaryStage) throws Exception{
        StackPane root=new StackPane();
        Button btn = new Button("Button1");
        Scene obj = new Scene(root,300,200);
        root.getChildren().add(btn);
        primaryStage.setScene(obj);
        primaryStage.setTitle("button");
        primaryStage.show();}
        public static void main(String[] args) {
            launch(args);
        }
    
}