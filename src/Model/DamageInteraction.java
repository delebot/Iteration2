package Model;

public class DamageInteraction implements Interaction {
    private SentientEntity entity;
    private int damageAmount;
    public DamageInteraction(SentientEntity entity, int damageAmount) {
        this.entity = entity;
        this.damageAmount = damageAmount;
    }

    @Override
    public void applyEffect() {
        entity.modifyHP(-damageAmount);
    }
}