import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.ToggleGroup;


public class question_5 extends Application {
    public static void main(String[] args)throws Exception {
        launch(args);
    }

    public void start(Stage primaryStage) {
        Label L1 = new Label("Full name");
        Label L2 = new Label("Email address");
        Label L3 = new Label("Password");
        Label L4 = new Label("Gender");
        Label L5 = new Label("Age");
        Label L6 = new Label("Interest");


        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        TextField tf3 = new TextField();

        CheckBox G1 = new CheckBox("18-25");
        CheckBox G2 = new CheckBox("26-35");
        CheckBox G3 = new CheckBox("36+");
        CheckBox G4 = new CheckBox("Sports");
        CheckBox G5 = new CheckBox("Music");
        CheckBox G6 = new CheckBox("Reading");
        CheckBox G7 = new CheckBox("Travel");

        ToggleGroup group = new ToggleGroup();
        RadioButton R1 = new RadioButton("Male");
        RadioButton R2 = new RadioButton("Female");
        RadioButton R3 = new RadioButton("Other");
        R1.setToggleGroup(group);
        R2.setToggleGroup(group);
        R3.setToggleGroup(group);

        Button Btn  = new Button("Submit");

        VBox root1 = new VBox();

        
        GridPane root = new GridPane();
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(10));

        root.addRow(0, L1, tf1);
        root.addRow(1, L2, tf2);
        root.addRow(2, L3, tf3);
        root.addRow(3, L4, R1,R2,R3);
        root.addRow(4, L5,G1,G2,G3);
        root.addRow(5, L6, G4,G5,G6,G7);
        root.addRow(6, Btn);
        

        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("User registration form");
        primaryStage.show();}}