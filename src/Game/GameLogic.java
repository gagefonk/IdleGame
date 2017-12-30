package Game;

import javafx.application.Platform;

public class GameLogic {

    private long money = 10L;
    private String moneyAsString = Long.toString(money);
    private Long moneyIncrement;

    public void updateMoneyIncrement(Long level){
        moneyIncrement += level;
    }

    public void pullUiUpdate(){
        money += moneyIncrement;
        System.out.println(moneyAsString);
    }

    public void mainGameLogic() {

        while (true) {
            try {
                Platform.runLater(() -> pullUiUpdate());
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
