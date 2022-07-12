package HeroGame;

public class Hero {
    protected int attackPoints;

    protected int defence;
    protected int healthPoints;

    @Override
    public String toString() {
        return "Hero{" +
                "defence=" + defence +
                ", healthPoints=" + healthPoints +
                ", attackPoints=" + attackPoints +
                '}';
    }

    public void updateHP(int healthPoints) {
        setHealthPoints(Math.max(healthPoints, 0));
    }


    public Hero(int attackP, int defenceP, int healthP) {
        this.defence = defenceP;
        this.healthPoints = healthP;
        this.attackPoints = attackP;
    }

    public int attack() {
        return attackPoints;
    }

    public int defence(int attack){
        return defence;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public int getDefence() {
        return defence;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getAttackPoints() {
        return attackPoints;
    }


}
