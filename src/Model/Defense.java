package Model;

public class Defense implements Stat{
    private int BaseDefensePoints;
    private int AddedDefensePoints;

    public Defense(int baseDefensePoints){
        if (baseDefensePoints <= 0) {
            BaseDefensePoints = 1; // Defense must be set above 0
        }
        else {
            BaseDefensePoints = baseDefensePoints;
        }
        AddedDefensePoints = 0;
    }

    public Defense(int baseDefensePoints, int addedDefensePoints) {
        if (baseDefensePoints <= 0) {
            BaseDefensePoints = 1; // Defense must be set above 0
        }
        else {
            BaseDefensePoints = baseDefensePoints;
        }
        AddedDefensePoints = addedDefensePoints;
    }
    
    public Defense(){
        BaseDefensePoints = 1;
        AddedDefensePoints = 0;
    }
    
    public int getBaseDefensePoints() {
        return BaseDefensePoints;
    }

    public void setBaseDefensePoints(int baseDefensePoints) {
        if (baseDefensePoints <= 0) {
            return;
        }
        else {
            BaseDefensePoints = baseDefensePoints;
        }
    }

    public int getAddedDefensePoints() {
        return AddedDefensePoints;
    }

    public void setAddedDefensePoints(int addedDefensePoints) {
        AddedDefensePoints = addedDefensePoints;
    }

    public int getDefensePoints(){
        if (AddedDefensePoints + BaseDefensePoints <= 0){
            return 1;
        }
        else {
            return BaseDefensePoints + AddedDefensePoints;
        }
    }

    public void clearModifier(){
        AddedDefensePoints = 0;
    }

    @Override
    public String getName() {
        return "Defense";
    }

    public void raiseBaseStat(int boost){ // Base defense can only be raised upon level up!
        if (boost <= 0){
            return;
        }
        else{
            BaseDefensePoints += boost;
        }
    }

    public void modify(int delta) {
        AddedDefensePoints += delta;
    }

}
