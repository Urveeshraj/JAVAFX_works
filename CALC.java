import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CALC extends Application {

    private TextField textField;

    @Override
    public void start(Stage primaryStage) {
        textField = new TextField();

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        for (int i = 0; i < 10; i++) {
            Button button = new Button(String.valueOf(i));
            button.setOnAction(event -> {
                textField.setText(textField.getText() + button.getText());
            });
            gridPane.add(button, i, 0);
        }

        Button addButton = new Button("+");
        addButton.setOnAction(event -> {
            try {
                int firstNumber = Integer.parseInt(textField.getText());
                int secondNumber = Integer.parseInt(textField.getText());
                textField.setText(String.valueOf(firstNumber + secondNumber));
            } catch (NumberFormatException e) {
                textField.setText("");
            }
        });
        gridPane.add(addButton, 1, 1);

        Button subtractButton = new Button("-");
        subtractButton.setOnAction(event -> {
            try {
                int firstNumber = Integer.parseInt(textField.getText());
                int secondNumber = Integer.parseInt(textField.getText());
                textField.setText(String.valueOf(firstNumber - secondNumber));
            } catch (NumberFormatException e) {
                textField.setText("");
            }
        });
        gridPane.add(subtractButton, 2, 1);

        Button multiplyButton = new Button("*");
        multiplyButton.setOnAction(event -> {
            try {
                int firstNumber = Integer.parseInt(textField.getText());
                int secondNumber = Integer.parseInt(textField.getText());
                textField.setText(String.valueOf(firstNumber * secondNumber));
            } catch (NumberFormatException e) {
                textField.setText("");
            }
        });
        gridPane.add(multiplyButton, 3, 1);

        Button divideButton = new Button("/");
        divideButton.setOnAction(event -> {
            try {
                int firstNumber = Integer.parseInt(textField.getText());
                int secondNumber = Integer.parseInt(textField.getText());
                textField.setText(String.valueOf(firstNumber / secondNumber));
            } catch (NumberFormatException e) {
                textField.setText("");
            } catch (ArithmeticException e) {
                textField.setText("Cannot divide by zero");
            }
        });
        gridPane.add(divideButton, 4, 1);

        Button clearButton = new Button("Clear");
        clearButton.setOnAction(event -> {
            textField.setText("");
        });
        gridPane.add(clearButton, 5, 1);

        Scene scene = new Scene(gridPane, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);}}
