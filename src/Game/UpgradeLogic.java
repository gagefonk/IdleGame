package Game;

public class UpgradeLogic {

    //create tier upgrade variables
    private Long t1Level = 0L;
    private Long t2Level = 0L;
    private Long t3Level = 0L;
    private Long t4Level = 0L;
    private Long t5Level = 0L;
    private Long t6Level = 0L;


    //create tier values
    private Long t1Value = 1L;
    private Long t2Value = 10L;
    private Long t3Value = 100L;
    private Long t4Value = 1000L;
    private Long t5Value = 10000L;
    private Long t6Value = 100000L;


    //create totalLevels
    private long totalValue = 0L;


    //create upgradeModifier
    private int upgradeModifier = 1;


    //get/set total value
    public long getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(long totalValue) {
        this.totalValue = totalValue;
    }


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


    //get tier values
    public Long getT1Value() {
        return t1Value;
    }

    public Long getT2Value() {
        return t2Value;
    }

    public Long getT3Value() {
        return t3Value;
    }

    public Long getT4Value() {
        return t4Value;
    }

    public Long getT5Value() {
        return t5Value;
    }

    public Long getT6Value() {
        return t6Value;
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


    //calculate the total value
    public void calculateTotalValue(){
        setTotalValue((t1Value * getT1Level()) + (t2Value * getT2Level())+ (t3Value * getT3Level()) + (t4Value * getT4Level()) + (t5Value * getT5Level()) + (t6Value * getT6Level()));
    }
}
