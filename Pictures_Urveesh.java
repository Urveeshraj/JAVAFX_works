//22BCE8084
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.effect.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Pictures_Urveesh extends Application {
    public void start(Stage primaryStage) throws Exception {
        BorderPane root1 = new BorderPane();
        VBox root2 = new VBox();
        VBox root = new VBox();

        Text title = new Text("URVEESH'S LUXURY CARS");
        title.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 20));

FileInputStream bentleyInput=new FileInputStream("C:/Users/Urveesh/Desktop/Just Engineer things/JavaFX practice/JavaFX_projects/src/BENTELY.jpeg");
FileInputStream rollsRoyceInput=new FileInputStream("C:/Users/Urveesh/Desktop/Just Engineer things/JavaFX practice/JavaFX_projects/src/RR GHOST.jpeg");
FileInputStream maybachInput=new FileInputStream("C:/Users/Urveesh/Desktop/Just Engineer things/JavaFX practice/JavaFX_projects/src/MAYBACH S 680.jpeg");

        Image bentleyImage = new Image(bentleyInput);
        Image rollsRoyceImage = new Image(rollsRoyceInput);
        Image maybachImage = new Image(maybachInput);

        ImageView bentleyImageView = new ImageView(bentleyImage);
        ImageView rollsRoyceImageView = new ImageView(rollsRoyceImage);
        ImageView maybachImageView = new ImageView(maybachImage);

        Text info = new Text("Luxury cars are high-end, premium vehicles that are known for their superior quality, comfort, performance, and advanced features. These cars are typically manufactured by luxury automobile brands and offer a luxurious and prestigious driving experience. ");
        info.setWrappingWidth(300);

        Label bentleyLabel = new Label("Bentley Flying Spur:");
        Label rollsRoyceLabel = new Label("Rolls Royce Ghost:");
        Label maybachLabel = new Label("Mercedes Benz Maybach S 680:");

        TextField bentleyTextField = new TextField();
        TextField rollsRoyceTextField = new TextField();
        TextField maybachTextField = new TextField();

        HBox bentleyBox = new HBox(10);
        bentleyBox.getChildren().addAll(bentleyImageView, bentleyLabel, bentleyTextField);

        HBox rollsRoyceBox = new HBox(10);
        rollsRoyceBox.getChildren().addAll(rollsRoyceImageView, rollsRoyceLabel, rollsRoyceTextField);

        HBox maybachBox = new HBox(10);
        maybachBox.getChildren().addAll(maybachImageView, maybachLabel, maybachTextField);

        Button rollsRoyceButton = new Button("Rolls Royce");
        Button bentleyButton = new Button("Bentley");
        Button mercedesButton = new Button("Mercedes Benz");
        Button SUBMITButton = new Button("SUBMIT");
        HBox buttonBox = new HBox(10);
        buttonBox.getChildren().addAll(rollsRoyceButton, bentleyButton, mercedesButton);
        buttonBox.getChildren().addAll(SUBMITButton);
        root2.getChildren().addAll(title, rollsRoyceBox, bentleyBox, maybachBox, buttonBox, info);
        root2.setAlignment(Pos.CENTER);

        MenuBar menubar = new MenuBar();
        Menu fileMenu = new Menu("HOME");
                Menu ABOUT = new Menu("ABOUT US");
                Menu CON = new Menu("CONTACT");
                Menu DS = new Menu("DATA SET");
                Menu R = new Menu("RESOURCES");

        Menu editMenu = new Menu("EDIT");
        Menu pictEffMenu = new Menu("Picture Effect");
        MenuItem noEffMenu = new MenuItem("No Effects");
        MenuItem sepToMenu = new MenuItem("Sepia Tone");
        sepToMenu.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent arg0) {
                SepiaTone sepia = new SepiaTone();
                sepia.setLevel(0.75);
                rollsRoyceImageView.setEffect(sepia);
                bentleyImageView.setEffect(sepia);
                maybachImageView.setEffect(sepia);
            }
        });
        MenuItem gloMenu = new MenuItem("Glow");
        gloMenu.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent arg0) {
                Glow glow = new Glow();
                glow.setLevel(0.1);
                rollsRoyceImageView.setEffect(glow);
                bentleyImageView.setEffect(glow);
                maybachImageView.setEffect(glow);
            }
        });
        MenuItem shadMenu = new MenuItem("Shadow");
        shadMenu.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent arg0) {
                DropShadow shadow = new DropShadow();
                shadow.setColor(Color.BLACK);
                shadow.setHeight(30);
                shadow.setRadius(12);
                shadow.setWidth(20);
                rollsRoyceImageView.setEffect(shadow);
                bentleyImageView.setEffect(shadow);
                maybachImageView.setEffect(shadow);
            }
        });
        Menu viewMenu = new Menu("VIEW");
        editMenu.getItems().addAll(pictEffMenu, noEffMenu);
        pictEffMenu.getItems().addAll(sepToMenu, gloMenu, shadMenu);
        root1.setTop(menubar);
        menubar.getMenus().addAll(fileMenu, ABOUT,CON,DS,R,editMenu, viewMenu);

        root.getChildren().addAll(root1, root2);
        Scene scene = new Scene(root, 1200, 400);
        primaryStage.setTitle("LUXURY CARS by Urveesh");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
