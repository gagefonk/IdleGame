package Game;

import javafx.application.Platform;

public class GameLogic {

    //ref obj
    UpgradeLogic upgradeLogic;
    MainGame mainGame;

    //create variables
    private long money = 10L;
    private long moneyIncrement = 0L;

    public GameLogic(UpgradeLogic upgradeLogic, MainGame mainGame) {
        this.upgradeLogic = upgradeLogic;
        this.mainGame = mainGame;
    }

    //get money
    public Long getMoney(){
        return money;
    }

    //set money
    public void setMoney(Long money){ this.money = money; }


    //update ui when thread sleeps
    public void updateUi(){
        mainGame.setMoneyText(money += moneyIncrement);
        upgradeLogic.calculateTotalValue();
        moneyIncrement = upgradeLogic.getTotalValue();
        mainGame.setUpgradeCostLabelText();
        mainGame.checkForUpgrade();
    }











    //main game logic
    public void mainGameLogic() {

        while (true) {
            Platform.runLater(() -> {
                try{
                    updateUi();
                }catch(NullPointerException t){
                    t.printStackTrace();
                    System.exit(1);
                }
            });
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

    }

    //create new thread for background and start clock for main game
    public void startMainGame() {
        Thread t1 = new Thread(() -> mainGameLogic());
        //t1.setDaemon(true);
        t1.start();

    }
}
