package Model;

public class Health {
    private int HealthPoints;
    private int MaxHealthPoints;

    public Health(int healthPoints) {
        if (healthPoints <= 0) {
            HealthPoints = 1; // Health must be set above 0
            MaxHealthPoints = 1;
        }
        else {
            HealthPoints = healthPoints;
            MaxHealthPoints = healthPoints;
        }
    }

    public Health(){
        HealthPoints = 1; // Health must be set above 0
        MaxHealthPoints = 1;
    }

    public int getHealthPoints() {
        return HealthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        if (healthPoints <= 0) {
            return;
        }
        else {
            HealthPoints = healthPoints;
        }
    }

    public int getMaxHealthPoints() {
        return MaxHealthPoints;
    }

    public void setMaxHealthPoints(int maxHealthPoints) {
        if (maxHealthPoints <= 0) {
            return;
        }
        else {
            MaxHealthPoints = maxHealthPoints;
        }
    }

    public void modifyHealth(int delta){
        if (delta > 0){
            heal(delta);
        }
        else if (delta < 0){
            takeDamage(delta);
        }
        else{
            return;
        }
    }

    public void heal(int HPamt){
        if (HealthPoints + HPamt >= MaxHealthPoints){
            HealthPoints = MaxHealthPoints;
        }
        else{
            HealthPoints = HealthPoints + HPamt;
        }
    }

    public void takeDamage(int dmgAmt){
        if (HealthPoints - dmgAmt <= 0){
            HealthPoints = 0;
        }
        else{
            HealthPoints = HealthPoints - dmgAmt;
        }
    }

    public void raiseMaxHealthPoints(int boost){ // Max HP can only be raised upon level up!
        if (boost <= 0){
            return;
        }
        else{
            MaxHealthPoints += boost;
            HealthPoints = MaxHealthPoints;
        }
    }

    public Boolean isDead(){
        return HealthPoints == 0;
    }
}