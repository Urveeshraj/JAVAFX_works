//22BCE8084
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class AreaConverter_ASSIGNMENT extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Area Converter ==> URVEESH RAJ SRIVASTAVA");

        Label acresLabel = new Label("Acres:");
        TextField acresTextField = new TextField();
        Label squareFeetLabel = new Label("Square Feet:");
        TextField squareFeetTextField = new TextField();
        Button convertButton = new Button("Convert");
        Label resultLabel = new Label("Results:");

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.addRow(0, acresLabel, acresTextField);
        gridPane.addRow(1, squareFeetLabel, squareFeetTextField);
        gridPane.addRow(2, convertButton);
        gridPane.addRow(3, resultLabel);
        convertButton.setOnAction(e -> {
            try {
                if (!acresTextField.getText().isEmpty()) {
                    double acres = Double.parseDouble(acresTextField.getText());
                    double hectares = acres * 0.404686;
                    resultLabel.setText("Hectares: " + hectares);
                }
                if (!squareFeetTextField.getText().isEmpty()) {
                    double squareFeet = Double.parseDouble(squareFeetTextField.getText());
                    double hectares = squareFeet * 0.0000092903;
                    resultLabel.setText(resultLabel.getText() + " Hectares: " + hectares);
                }
                if (!acresTextField.getText().isEmpty()) {
                    double hectares = Double.parseDouble(acresTextField.getText());
                    double acres = hectares * 2.47105;
                    resultLabel.setText(resultLabel.getText() + " Acres: " + acres);
                }
                if (!squareFeetTextField.getText().isEmpty()) {
                    double squareFeet = Double.parseDouble(squareFeetTextField.getText());
                    double acres = squareFeet * 0.0000229568;
                    resultLabel.setText(resultLabel.getText() + " Acres: " + acres);
                }
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input");}});
        Scene scene = new Scene(gridPane, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();}}
