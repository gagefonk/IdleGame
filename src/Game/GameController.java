package Game;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class GameController implements Initializable {

    @FXML
    MainGame mainGame;
    @FXML
    GameLogic gameLogic;
    @FXML
    UpgradeLogic upgradeLogic;

    @FXML
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Hello");
        mainGame.init(this);
        gameLogic.init(this);
        //upgradeLogic.init(this);
    }

    public void updateUi() {
        try{
            mainGame.moneyText.setText(Long.toString(upgradeLogic.getT1Level()));
        }catch(NullPointerException e){
            e.printStackTrace();
        }
    }
}