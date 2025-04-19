import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class menu1 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 200, 300);
        MenuBar menuBar = new MenuBar();

        Menu fileMenu = new Menu("File");
        MenuItem menu1 = new MenuItem("New");
        MenuItem menu2 = new MenuItem("Save");
        MenuItem menu3 = new MenuItem("Exit");
        fileMenu.getItems().addAll(menu1, menu2, menu3);

        Menu editMenu = new Menu("Edit");
        MenuItem menu13 = new MenuItem("Copy");
        MenuItem menu23 = new MenuItem("Paste");
        MenuItem menu33 = new MenuItem("Cut");
        editMenu.getItems().addAll(menu13, menu23, menu33);

        menuBar.getMenus().addAll(fileMenu, editMenu);
        root.setTop(menuBar);

        primaryStage.setScene(scene);
        primaryStage.setTitle("MENU");
        primaryStage.show();
    }
}
