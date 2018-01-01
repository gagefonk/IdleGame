package Game;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class MainGame implements Initializable {

    //create objects
    UpgradeLogic upgrade = new UpgradeLogic(this);
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

    //create upgrade cost labels;
    public Label t1UpgradeCostLabel;
    public Label t2UpgradeCostLabel;
    public Label t3UpgradeCostLabel;
    public Label t4UpgradeCostLabel;
    public Label t5UpgradeCostLabel;
    public Label t6UpgradeCostLabel;

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
    public Label moneyText;

    //update text
    public void setMoneyText(Long text){
        moneyText.setText("$" + Long.toString(text));
    }

    public void setUpgradeCostLabelText(){
        t1UpgradeCostLabel.setText("$" + Long.toString(upgrade.getT1UpgradeCost()));
        t2UpgradeCostLabel.setText("$" + Long.toString(upgrade.getT2UpgradeCost()));
        t3UpgradeCostLabel.setText("$" + Long.toString(upgrade.getT3UpgradeCost()));
        t4UpgradeCostLabel.setText("$" + Long.toString(upgrade.getT4UpgradeCost()));
        t5UpgradeCostLabel.setText("$" + Long.toString(upgrade.getT5UpgradeCost()));
        t6UpgradeCostLabel.setText("$" + Long.toString(upgrade.getT6UpgradeCost()));
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
        if (gameLogic.getMoney() >= (upgrade.getT1UpgradeCost() * upgrade.getUpgradeModifier())) {
            upgrade.setT1Level(upgrade.upgradeTier(upgrade.getT1Level()));
            t1TextLevel.setText(upgrade.setUpgradeText(upgrade.getT1Level()));
            t1MoneyPerSec.setText("$" + upgrade.setUpgradeText(upgrade.getT1Level() * upgrade.getT1Value()) + " /sec");
            //testing updating upgrade cost
            gameLogic.setMoney(gameLogic.getMoney() - upgrade.getT1UpgradeCost());
            upgrade.setT1UpgradeCost(upgrade.updateUpgradeCost(upgrade.getT1UpgradeCost(), upgrade.getT1Level()));
        }
    }

    public void T2UpgradeBtnClicked(){
        if (gameLogic.getMoney() >= (upgrade.getT2UpgradeCost() * upgrade.getUpgradeModifier())) {
            upgrade.setT2Level(upgrade.upgradeTier(upgrade.getT2Level()));
            t2TextLevel.setText(upgrade.setUpgradeText(upgrade.getT2Level()));
            t2MoneyPerSec.setText("$" + upgrade.setUpgradeText(upgrade.getT2Level() * upgrade.getT2Value()) + " /sec");
            gameLogic.setMoney((gameLogic.getMoney() - upgrade.getT2UpgradeCost()));
            upgrade.setT2UpgradeCost(upgrade.updateUpgradeCost(upgrade.getT2UpgradeCost(), upgrade.getT2Level()));
            checkForUpgrade();
        }
    }

    public void T3UpgradeBtnClicked(){
        if (gameLogic.getMoney() >= (upgrade.getT3UpgradeCost() * upgrade. getUpgradeModifier())) {
            upgrade.setT3Level(upgrade.upgradeTier(upgrade.getT3Level()));
            t3TextLevel.setText(upgrade.setUpgradeText(upgrade.getT3Level()));
            t3MoneyPerSec.setText("$" + upgrade.setUpgradeText(upgrade.getT3Level() * upgrade.getT3Value()) + " /sec");
            gameLogic.setMoney(gameLogic.getMoney() - upgrade.getT3UpgradeCost());
            upgrade.setT3UpgradeCost(upgrade.updateUpgradeCost(upgrade.getT3UpgradeCost(), upgrade.getT3Level()));
        }
    }

    public void T4UpgradeBtnClicked(){
        if (gameLogic.getMoney() >= (upgrade.getT4UpgradeCost() * upgrade.getUpgradeModifier())) {
            upgrade.setT4Level(upgrade.upgradeTier(upgrade.getT4Level()));
            t4TextLevel.setText(upgrade.setUpgradeText(upgrade.getT4Level()));
            t4MoneyPerSec.setText("$" + upgrade.setUpgradeText(upgrade.getT4Level() * upgrade.getT4Value()) + " /sec");
            gameLogic.setMoney(gameLogic.getMoney() - upgrade.getT4UpgradeCost());
            upgrade.setT4UpgradeCost(upgrade.updateUpgradeCost(upgrade.getT4UpgradeCost(), upgrade.getT4Level()));
        }
    }

    public void T5UpgradeBtnClicked(){
        if (gameLogic.getMoney() >= (upgrade.getT5UpgradeCost() * upgrade.getUpgradeModifier())) {
            upgrade.setT5Level(upgrade.upgradeTier(upgrade.getT5Level()));
            t5TextLevel.setText(upgrade.setUpgradeText(upgrade.getT5Level()));
            t5MoneyPerSec.setText("$" + upgrade.setUpgradeText(upgrade.getT5Level() * upgrade.getT5Value()) + " /sec");
            gameLogic.setMoney(gameLogic.getMoney() - upgrade.getT5UpgradeCost());
            upgrade.setT5UpgradeCost(upgrade.updateUpgradeCost(upgrade.getT5UpgradeCost(), upgrade.getT5Level()));
        }
    }

    public void T6UpgradeBtnClicked(){
        if (gameLogic.getMoney() >= (upgrade.getT6UpgradeCost() * upgrade.getUpgradeModifier())) {
            upgrade.setT6Level(upgrade.upgradeTier(upgrade.getT6Level()));
            t6TextLevel.setText(upgrade.setUpgradeText(upgrade.getT6Level()));
            t6MoneyPerSec.setText("$" + upgrade.setUpgradeText(upgrade.getT6Level() * upgrade.getT6Value()) + " /sec");
            gameLogic.setMoney(gameLogic.getMoney() - upgrade.getT6UpgradeCost());
            upgrade.setT6UpgradeCost(upgrade.updateUpgradeCost(upgrade.getT6UpgradeCost(), upgrade.getT6Level()));
        }
    }


    //check to see if able to be upgraded and change color of button if not able to be upgradeable
    public void checkForUpgrade(){
        if (gameLogic.getMoney() < (upgrade.getT1UpgradeCost() * upgrade.getUpgradeModifier())) {
            t1UpgradeBtn.setDisable(true);
        }else{
            t1UpgradeBtn.setDisable(false);
        }
        if (gameLogic.getMoney() < (upgrade.getT2UpgradeCost() * upgrade.getUpgradeModifier())) {
            t2UpgradeBtn.setDisable(true);
        }else{
            t2UpgradeBtn.setDisable(false);
        }
        if (gameLogic.getMoney() < (upgrade.getT3UpgradeCost() * upgrade.getUpgradeModifier())) {
            t3UpgradeBtn.setDisable(true);
        }else{
            t3UpgradeBtn.setDisable(false);
        }
        if (gameLogic.getMoney() < (upgrade.getT4UpgradeCost() * upgrade.getUpgradeModifier())) {
            t4UpgradeBtn.setDisable(true);
        }else{
            t4UpgradeBtn.setDisable(false);
        }
        if (gameLogic.getMoney() < (upgrade.getT5UpgradeCost() * upgrade.getUpgradeModifier())) {
            t5UpgradeBtn.setDisable(true);
        }else{
            t5UpgradeBtn.setDisable(false);
        }
        if (gameLogic.getMoney() < (upgrade.getT6UpgradeCost() * upgrade.getUpgradeModifier())) {
            t6UpgradeBtn.setDisable(true);
        }else{
            t6UpgradeBtn.setDisable(false);
        }

    }

    //create Initializable
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
        stage.setResizable(false);
        stage.show();
    }

    private void closeProgram(){
        //close and end threads
        System.exit(0);
    }
}
