package Game;

import javafx.application.Platform;

public class GameLogic {

    private long money = 10L;
    private String moneyAsString = Long.toString(money);
    private Long moneyIncrement = 0L;
    private Long t1 = 0L;
    UpgradeLogic upgrade = new UpgradeLogic();

    public Long updateMoneyIncrement(Long TotalLevels, Long levels){
        if (TotalLevels < levels ) {
            moneyIncrement += TotalLevels;
            return moneyIncrement;
        }else{
            return null;
        }
    }

    public void setMoneyAsString(){
        moneyAsString = Long.toString(money);
    }

    public void pullUiUpdate(){
       // updateMoneyIncrement(upgrade.getTotalLevels(), moneyIncrement);
        money += moneyIncrement;
        setMoneyAsString();
        //upgrade.addTotalLevels();
        System.out.println(moneyAsString);
        System.out.println(upgrade.getT1Level());
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
