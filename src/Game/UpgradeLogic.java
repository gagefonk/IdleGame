package Game;

public class UpgradeLogic {

    //link to game controller
    private GameController gameController;

    //create tier upgrade variables
    private Long t1Level = 0L;
    private Long t2Level = 0L;
    private Long t3Level = 0L;
    private Long t4Level = 0L;
    private Long t5Level = 0L;
    private Long t6Level = 0L;

    //create upgradeModifier
    private int upgradeModifier = 1;
    
    //get/set upgradeModifier
    public int getUpgradeModifier() {
        return upgradeModifier;
    }

    private void setUpgradeModifier(int upgradeModifier) {
        this.upgradeModifier = upgradeModifier;
    }

    //get/set for tier levels
    public Long getT1Level() {
        return t1Level;
    }

    public void setT1Level(Long t1Level) {
        this.t1Level = t1Level;
    }

    public Long getT2Level() {
        return t2Level;
    }

    public void setT2Level(Long t2Level) {
        this.t2Level = t2Level;
    }

    public Long getT3Level() {
        return t3Level;
    }

    public void setT3Level(Long t3Level) {
        this.t3Level = t3Level;
    }

    public Long getT4Level() {
        return t4Level;
    }

    public void setT4Level(Long t4Level) {
        this.t4Level = t4Level;
    }

    public Long getT5Level() {
        return t5Level;
    }

    public void setT5Level(Long t5Level) {
        this.t5Level = t5Level;
    }

    public Long getT6Level() {
        return t6Level;
    }

    public void setT6Level(Long t6Level) {
        this.t6Level = t6Level;
    }

    //upgrade levels
    public Long upgradeTier(Long upgradeLevel){
        return upgradeLevel + upgradeModifier;
    }

    //change upgrade text for main display
    public String setUpgradeText(Long level){
        return Long.toString(level);
    }
    
    //change upgradeModifier on button click
    public void upgradeModifierChange(){
        
        if (upgradeModifier == 1){
            setUpgradeModifier(10);
        } else if (upgradeModifier == 10){
            setUpgradeModifier(100);
        }else if (upgradeModifier == 100){
            setUpgradeModifier(1);
        }
    }

    //game controller init
    public void init(GameController gameController){
        this.gameController = gameController;
    }
}
