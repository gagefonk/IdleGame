package Game;

public class GameLogic {

    //create variables
    private Long money = 10L;

    //get/set for money
    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money += money;
        //upgrade money text also
        //MainGame.moneyText.setText(Long.toString(this.money));
    }

    public void updateMoney(){

        while (true){
            try{
                setMoney(money);
                System.out.println(money);
                Thread.sleep(1000);;
            } catch(InterruptedException e){
                System.out.println(e);
            }
        }

    }


    //create new thread for background and start clock for main game
    public void start(){
        Thread t1 = new Thread(new Runnable() {
            public void run()
            {
                updateMoney();
            }});
        t1.start();
    }

}
