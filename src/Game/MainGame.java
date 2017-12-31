package Game;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class MainGame implements Initializable {

    //create objects
    UpgradeLogic upgrade = new UpgradeLogic();
    GameLogic gameLogic = new GameLogic(upgrade, this);


    //create menu
    public MenuBar mainMenuBar;
    public MenuItem aboutMenuBtn;
    public MenuItem optionsMenuBtn;
    public MenuItem exitMenuBtn;

    //create upgrade buttons
    public Button t1UpgradeBtn;
    public Button t2UpgradeBtn;
    public Button t3UpgradeBtn;
    public Button t4UpgradeBtn;
    public Button t5UpgradeBtn;
    public Button t6UpgradeBtn;

    //create modifier btn
    public Button modifierBtn;

    //create level text
    public Text t1TextLevel;
    public Text t2TextLevel;
    public Text t3TextLevel;
    public Text t4TextLevel;
    public Text t5TextLevel;
    public Text t6TextLevel;

    //create tier money per second text
    public Text t1MoneyPerSec;
    public Text t2MoneyPerSec;
    public Text t3MoneyPerSec;
    public Text t4MoneyPerSec;
    public Text t5MoneyPerSec;
    public Text t6MoneyPerSec;


    //create moneyText text
    @FXML
    //public Text moneyText;
    public Label moneyText = new Label("$10");

    //update text
    public void setMoneyText(Long text){
        moneyText.setText(Long.toString(text));
    }

    //create about menu creation
    About about = new About();
    public void aboutMenuBtnClicked() throws Exception{
        about.display();
    }

    //file - > close window
    public void exitMenuBtnClicked(){
        closeProgram();
        Stage stage = (Stage) mainMenuBar.getScene().getWindow();
        stage.close();
    }

    //create button click actions

    public void modifierBtnClicked(){
        upgrade.upgradeModifierChange();
        modifierBtn.setText("Modifier: " + Integer.toString(upgrade.getUpgradeModifier()));
    }

    public void T1UpgradeBtnClicked(){
        upgrade.setT1Level(upgrade.upgradeTier(upgrade.getT1Level()));
        t1TextLevel.setText(upgrade.setUpgradeText(upgrade.getT1Level()));
        t1MoneyPerSec.setText("$" + upgrade.setUpgradeText(upgrade.getT1Level() * upgrade.getT1Value()) + " /sec");
    }

    public void T2UpgradeBtnClicked(){
        upgrade.setT2Level(upgrade.upgradeTier(upgrade.getT2Level()));
        t2TextLevel.setText(upgrade.setUpgradeText(upgrade.getT2Level()));
        t2MoneyPerSec.setText("$" + upgrade.setUpgradeText(upgrade.getT2Level() * upgrade.getT2Value()) + " /sec");
    }

    public void T3UpgradeBtnClicked(){
        upgrade.setT3Level(upgrade.upgradeTier(upgrade.getT3Level()));
        t3TextLevel.setText(upgrade.setUpgradeText(upgrade.getT3Level()));
        t3MoneyPerSec.setText("$" + upgrade.setUpgradeText(upgrade.getT3Level() * upgrade.getT3Value()) + " /sec");
    }

    public void T4UpgradeBtnClicked(){
        upgrade.setT4Level(upgrade.upgradeTier(upgrade.getT4Level()));
        t4TextLevel.setText(upgrade.setUpgradeText(upgrade.getT4Level()));
        t4MoneyPerSec.setText("$" + upgrade.setUpgradeText(upgrade.getT4Level() * upgrade.getT4Value()) + " /sec");
    }

    public void T5UpgradeBtnClicked(){
        upgrade.setT5Level(upgrade.upgradeTier(upgrade.getT5Level()));
        t5TextLevel.setText(upgrade.setUpgradeText(upgrade.getT5Level()));
        t5MoneyPerSec.setText("$" + upgrade.setUpgradeText(upgrade.getT5Level() * upgrade.getT5Value()) + " /sec");
    }

    public void T6UpgradeBtnClicked(){
        upgrade.setT6Level(upgrade.upgradeTier(upgrade.getT6Level()));
        t6TextLevel.setText(upgrade.setUpgradeText(upgrade.getT6Level()));
        t6MoneyPerSec.setText("$" + upgrade.setUpgradeText(upgrade.getT6Level() * upgrade.getT6Value()) + " /sec");
    }

    //create initializable
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        gameLogic.startMainGame();
    }

    //draw window for main game
    public void display() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../Fxmls/mainGame.fxml"));
        Stage stage = new Stage();
        stage.setOnCloseRequest(e -> closeProgram());
        stage.setTitle("Idle Game");
        stage.setScene(new Scene(root));
        stage.show();
    }

    private void closeProgram(){
        //close and end threads
        System.exit(0);
    }
}
