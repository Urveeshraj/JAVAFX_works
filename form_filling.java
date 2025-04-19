import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class form_filling extends Application {
    public static void main(String[] args) {
        launch(args);}
        public void start(Stage primaryStage) throws Exception{
        Label user_id=new Label("User Id");
        Label password=new Label("Password");
        TextField tf1=new TextField();
        TextField tf2=new TextField();
        Button b = new Button("Submit Button");
        GridPane root = new GridPane();
        root.addRow(0,user_id,tf1);
        root.addRow(1,password,tf2);
        root.addRow(2,b);
        Scene s = new Scene(root,500,500);         
        primaryStage.setScene(s);
        primaryStage.setTitle("Facebook login window");
        primaryStage.show();}}
