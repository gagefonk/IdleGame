package MainGame;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainGame {

    //draw window for main game
    public void display() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("mainGame.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Idle Game");
        stage.setScene(new Scene(root));
        stage.show();

    }
}
