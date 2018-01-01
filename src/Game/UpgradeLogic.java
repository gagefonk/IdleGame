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
    private final Long t1Value = 1L;
    private final Long t2Value = 10L;
    private final Long t3Value = 100L;
    private final Long t4Value = 1000L;
    private final Long t5Value = 10000L;
    private final Long t6Value = 100000L;

    //create upgrade cost variables
    private Long t1UpgradeCost = 10L;
    private Long t2UpgradeCost = 1000L;
    private Long t3UpgradeCost = 100000L;
    private Long t4UpgradeCost = 10000000L;
    private Long t5UpgradeCost = 1000000000L;
    private Long t6UpgradeCost = 100000000000L;


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


    //get/set upgrade cost
    public Long getT1UpgradeCost() {
        return t1UpgradeCost;
    }

    public void setT1UpgradeCost(Long t1UpgradeCost) {
        this.t1UpgradeCost = t1UpgradeCost;
    }

    public Long getT2UpgradeCost() {
        return t2UpgradeCost;
    }

    public void setT2UpgradeCost(Long t2UpgradeCost) {
        this.t2UpgradeCost = t2UpgradeCost;
    }

    public Long getT3UpgradeCost() {
        return t3UpgradeCost;
    }

    public void setT3UpgradeCost(Long t3UpgradeCost) {
        this.t3UpgradeCost = t3UpgradeCost;
    }

    public Long getT4UpgradeCost() {
        return t4UpgradeCost;
    }

    public void setT4UpgradeCost(Long t4UpgradeCost) {
        this.t4UpgradeCost = t4UpgradeCost;
    }

    public Long getT5UpgradeCost() {
        return t5UpgradeCost;
    }

    public void setT5UpgradeCost(Long t5UpgradeCost) {
        this.t5UpgradeCost = t5UpgradeCost;
    }

    public Long getT6UpgradeCost() {
        return t6UpgradeCost;
    }

    public void setT6UpgradeCost(Long t6UpgradeCOst) {
        this.t6UpgradeCost = t6UpgradeCOst;
    }



    //upgrade levels
    public Long upgradeTier(Long upgradeLevel){
        return upgradeLevel + upgradeModifier;
    }


    //update upgrade cost
    public Long updateUpgradeCost(Long currentUpgradeCost, Long level){
        Long newUpgradeCost;
        newUpgradeCost = currentUpgradeCost * 2;
        return newUpgradeCost;
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
