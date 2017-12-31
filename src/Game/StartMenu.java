package Game;

import javafx.scene.control.Button;
import javafx.stage.Stage;

public class StartMenu {

    //create buttons
    public Button startGameBtn;
    public Button exitGameBtn;

    //create objs for Game reference
    MainGame mainGame = new MainGame();


    //start game Button Action
    public void startGameBtnClicked() throws Exception {
        mainGame.display();
        closeStartMenu(startGameBtn);
    }


    //exit game button action
    public void exitGameBtnClicked(){
        closeStartMenu(exitGameBtn);
    }

    //close window for both applications
    public void closeStartMenu(Button button){
        Stage stage = (Stage) button.getScene().getWindow();
        stage.close();
    }
}
