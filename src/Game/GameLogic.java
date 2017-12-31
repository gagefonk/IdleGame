package Game;

import javafx.application.Platform;

public class GameLogic {

    //create link to Game Controller
    private GameController gameController;

    //init method for game controller
    public void init(GameController gameController){
        this.gameController = gameController;
    }

    public void mainGameLogic() {

        while (true) {
            Platform.runLater(() -> {
                try{
                    gameController.updateUi();
                }catch(NullPointerException t){
                    t.printStackTrace();
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
    public void start() {
        Thread t1 = new Thread(() -> mainGameLogic());
        t1.setDaemon(true);
        t1.start();

    }
}
