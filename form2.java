// [12:01 PM] VEDANT JALAN
    import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class form2 extends Application {
    public static void main(String args[]) {
        launch(args);}   
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Personal Information");
        GridPane grid =new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setHgap(5);
        grid.setVgap(5);
    
        Label l1=new Label("Personal Information");
        Label l2=new Label("Employee ID:");
        Label l3=new Label("First Name:");
        Label l4=new Label("Middle Name:");
        Label l5=new Label("Last Name:");
        Label l6=new Label("Gender:");
        Label l7=new Label("Nationality:");
        Label l8=new Label("Company Information");
        Label l9=new Label("QID");
        Label l10=new Label("Passport No:");
        Label l11=new Label("Passport Expiry:");
        TextField tf1=new TextField();
        TextField tf2=new TextField();
        TextField tf3=new TextField();
        TextField tf4=new TextField();
        TextField tf5=new TextField();
        TextField tf6=new TextField();
        TextField tf7=new TextField();
        TextField tf8=new TextField();
        TextField tf9=new TextField();
        Button b1=new Button("Upload an image");
        Button b2=new Button("Clear");
        Button b3=new Button("Add to Record");
        GridPane.setConstraints(l1,0,0);
        GridPane.setConstraints(l2,0,1);
GridPane.setConstraints(l3,0,2);
GridPane.setConstraints(l4,0,3);
GridPane.setConstraints(l5,0,4);
GridPane.setConstraints(l6,0,5);
GridPane.setConstraints(l7,0,6);
GridPane.setConstraints(l8,0,7);
GridPane.setConstraints(l9,0,8);
GridPane.setConstraints(l10,0,9);
GridPane.setConstraints(l11,0,10);
GridPane.setConstraints(tf1,1,1);
GridPane.setConstraints(tf2,1,2);
GridPane.setConstraints(tf3,1,3);
GridPane.setConstraints(tf4,1,4);
GridPane.setConstraints(tf5,1,5);
GridPane.setConstraints(tf6,1,6);
GridPane.setConstraints(tf7,1,8);
GridPane.setConstraints(tf8,1,9);
GridPane.setConstraints(tf9,1,10);
GridPane.setConstraints(b1,4,5);
GridPane.setConstraints(b2,4,6);
GridPane.setConstraints(b3,4,7);
grid.getChildren().addAll(l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,b1,b2,b3);
Scene scene=new Scene(grid,500,200);
        primaryStage.setScene(scene);
        primaryStage.show();    
    }}
// <https://teams.microsoft.com/l/message/19:omsRlHXH0s7xGXqMdcYTAlfbBdjB0shS3wxJ-xOw9vM1@thread.tacv2/1686465068646?tenantId=ff335ba2-bb68-489a-bbdd-f49ab4319838&amp;groupId=de3aa811-9e22-402a-ae0d-f6978f33794b&amp;parentMessageId=1686414962119&amp;teamName=OOPs Extra Class&amp;channelName=General&amp;createdTime=1686465068646&amp;allowXTenantAccess=false>