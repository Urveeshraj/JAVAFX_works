import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.Group;

public class tree1 extends Application {
	public static void main(String args[]) {
		launch(args);
	}
	public void start(Stage primaryStage)throws Exception {
		TreeItem root1=new TreeItem("bfgrtg");
		TreeItem item1=new TreeItem("fgfdvf");	
		TreeItem item2=new TreeItem("fgffdfdvf");	
		TreeItem item3=new TreeItem("fgfdvdfdvf");

		root1.getChildren().addAll(item1,item2,item3);

		TreeItem root2=new TreeItem("gfdfgfefewdf");
		TreeItem item4=new TreeItem("erfrfgfdvf");	
		TreeItem item5=new TreeItem("fgegrtgffdfdvf");	
		TreeItem item6=new TreeItem("fgfdvdgerefdvf");	

		root2.getChildren().addAll(item4,item5,item6);

		TreeItem root3=new TreeItem("gfdfgdf");
		TreeItem item7=new TreeItem("rfgfdvf");	
		TreeItem item8=new TreeItem("tgffdfdvf");	
		TreeItem item9=new TreeItem("dgerefdvf");

		root3.getChildren().addAll(item7,item8,item9);

		TreeItem<String> base =new TreeItem<String>("Subjects");
		base.setExpanded(true);
		base.getChildren().addAll(root1,root2,root3);

		TreeView view =new TreeView(base);
		view.setPrefHeight(500);
		VBox pane=new VBox(10);
		pane.setPadding(new Insets(5,5,5,50));
		pane.getChildren().addAll(view);

		Group obj=new Group(pane);
		Scene scene=new Scene(obj,595,320,Color.RED);
		primaryStage.setTitle("Tree View");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
