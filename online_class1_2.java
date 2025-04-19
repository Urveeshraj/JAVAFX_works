import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;

public class online_class1_2 extends Application{
	private TextField operand1Field;
	private TextField operand2Field;
	private TextField resultField;
	public static void main(String args[]){
	launch(args);
	}
	public void start(Stage primaryStage) throws Exception {
		
		
		primaryStage.setTitle("Addition Buttons");
		GridPane grid=new GridPane();
		grid.setPadding(new Insets(10,10,10,10));
		grid.setVgap(5);
		grid.setHgap(5);
		
		Label operand1Label =new Label("Operand1");
		operand1Field =new TextField();
		Label operand2Label =new Label("Operand2");
		operand2Field =new TextField();
		Label resultLabel =new Label("Result");
		resultField =new TextField();
		resultField.setEditable(false);

		Button b1=new Button("Add");
		b1.setOnAction(e->addNumbers());
		Button clrButton =new Button("Clear");
		clrButton.setOnAction(e->clearFields());

		GridPane.setConstraints(operand1Field,0,0);
		GridPane.setConstraints(operand1Label,0,1);
		GridPane.setConstraints(operand2Field,1,0);
		GridPane.setConstraints(operand2Label,1,1);
		GridPane.setConstraints(resultLabel,0,2);
		GridPane.setConstraints(resultField,1,2);
		GridPane.setConstraints(b1,0,3);
		GridPane.setConstraints(clrButton,1,3);

				grid.getChildren().addAll(operand1Field,operand1Label,operand2Field,operand2Label,resultLabel,resultField,b1,clrButton);
		
		Scene scene=new Scene(grid,300,300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void addNumbers(){
		try{
			int n1=Integer.valueOf(operand1Field.getText());
			int n2=Integer.valueOf(operand2Field.getText());
			int result=n1+n2;
			resultField.setText(Integer.toString(result));
		}catch(NumberFormatException e){
			resultField.setText("Invalid input");
		}
	}
	public void clearFields() {
		operand1Field.clear();
		operand2Field.clear();
		resultField.clear();
	}
}
