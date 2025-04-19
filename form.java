import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class form extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        Label employeeId = new Label("Employee Id");
        Label firstName = new Label("First name");
        Label middleName = new Label("Middle name");
        Label lastName = new Label("Last name");
        Label nationality = new Label("Nationality");
        Label qid = new Label("QID");
        Label passportNo = new Label("Passport no.");
        Label passportEntry = new Label("Passport entry");

        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        TextField tf3 = new TextField();
        TextField tf4 = new TextField();
        TextField tf5 = new TextField();
        TextField tf6 = new TextField();
        TextField tf7 = new TextField();
        TextField tf8 = new TextField();

        Button b = new Button("Gender");
        CheckBox G1 = new CheckBox("Male");
        CheckBox G2 = new CheckBox("Female");
        CheckBox G3 = new CheckBox("Gaurav");

        GridPane root = new GridPane();
        root.setHgap(10);
        root.setVgap(10);
        root.setPadding(new Insets(10));

        root.addRow(0, employeeId, tf1);
        root.addRow(1, firstName, tf2);
        root.addRow(2, middleName, tf3);
        root.addRow(3, lastName, tf4);
        root.addRow(4, b,G1,G2,G3);
        root.addRow(5, nationality, tf5);
        root.addRow(6, qid, tf6);
        root.addRow(7, passportNo, tf7);
        root.addRow(8, passportEntry, tf8);

        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Personal Information");
        primaryStage.show();}}