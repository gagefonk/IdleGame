package Game;

import javafx.application.Platform;

public class GameLogic {


    UpgradeLogic upgradeLogic;
    MainGame main;

    public void pullUiUpdate(){
       main.setMoneyText(Long.toString(upgradeLogic.getT1Level()));
    }

    public void mainGameLogic() {

        while (true) {
            Platform.runLater(() -> pullUiUpdate());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

    }


    //create new thread for background and start clock for main game
    public void start() {
        Thread t1 = new Thread(() -> mainGameLogic());
        t1.setDaemon(true);
        t1.start();

    }
}
