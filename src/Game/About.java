package Game;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class About {

    //create button
    public Button aboutCloseBtn;

    //close window
    public void aboutCloseBtnClicked(){
        Stage stage = (Stage) aboutCloseBtn.getScene().getWindow();
        stage.close();
    }

    public void display() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/Fxmls/about.fxml"));
        Stage stage = new Stage();
        stage.setTitle("About");
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setAlwaysOnTop(true);
        stage.show();
    }
}
