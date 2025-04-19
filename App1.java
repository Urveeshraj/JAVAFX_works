//22BCE8084
//Write a JavaFX program that works as a simple calculator. Use a grid layout to arrange buttons for the digits and for the +,-,*,% operations. 
//Add a text field to display the result. Handle any possible exceptions like divide by zero.
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App1 extends Application {
    private TextField display;

    private String currentOperator;
    private double currentValue;
    private boolean operatorClicked;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Calculator");

        // Create the display TextField
        display = new TextField();
        display.setEditable(false);
        display.setAlignment(Pos.CENTER_RIGHT);

        // Create the buttons for digits and operations
        Button[] digitButtons = new Button[10];
        for (int i = 0; i < 10; i++) {
            final int digit = i;
            digitButtons[i] = new Button(String.valueOf(i));
            digitButtons[i].setOnAction(e -> handleDigitButton(digit));
        }

        Button addButton = createOperatorButton("+");
        Button subtractButton = createOperatorButton("-");
        Button multiplyButton = createOperatorButton("*");
        Button modulusButton = createOperatorButton("%");

        // Create the grid layout and add components to it
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(5);
        gridPane.setVgap(5);

        gridPane.add(display, 0, 0, 4, 1);
        gridPane.add(digitButtons[7], 0, 1);
        gridPane.add(digitButtons[8], 1, 1);
        gridPane.add(digitButtons[9], 2, 1);
        gridPane.add(addButton, 3, 1);
        gridPane.add(digitButtons[4], 0, 2);
        gridPane.add(digitButtons[5], 1, 2);
        gridPane.add(digitButtons[6], 2, 2);
        gridPane.add(subtractButton, 3, 2);
        gridPane.add(digitButtons[1], 0, 3);
        gridPane.add(digitButtons[2], 1, 3);
        gridPane.add(digitButtons[3], 2, 3);
        gridPane.add(multiplyButton, 3, 3);
        gridPane.add(digitButtons[0], 0, 4);
        gridPane.add(modulusButton, 1, 4);
        Button equalsButton = new Button("=");
        equalsButton.setOnAction(e -> evaluateExpression());
        gridPane.add(equalsButton, 2, 4, 2, 1);

        // Create the scene and set it in the stage
        Scene scene = new Scene(gridPane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Button createOperatorButton(String operator) {
        Button button = new Button(operator);
        button.setOnAction(e -> handleOperatorButton(operator));
        return button;
    }

    private void handleDigitButton(int digit) {
        if (operatorClicked) {
            display.clear();
            operatorClicked = false;
        }
        display.appendText(String.valueOf(digit));
    }

    private void handleOperatorButton(String operator) {
        currentOperator = operator;
        currentValue = Double.parseDouble(display.getText());
        operatorClicked = true;
    }
    private void evaluateExpression() {
        if (!operatorClicked) {
            try {
                double secondValue = Double.parseDouble(display.getText());
                double result;
                switch (currentOperator) {
                    case "+":
                        result = currentValue + secondValue;
                        break;
                    case "-":
                        result = currentValue - secondValue;
                        break;
                    case "*":
                        result = currentValue * secondValue;
                        break;
                    case "%":
                        if (secondValue == 0) {
                            display.setText("Error: Divide by zero");
                            return;}
                        result = currentValue % secondValue;
                        break;
                    default:
                        return;}
                display.setText(String.valueOf(result));
            } catch (Exception e) {
                display.setText("Error: Invalid input");}}}
    public static void main(String[] args) {
        launch(args);}}