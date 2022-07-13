package HeroGame;

public class Tank extends Hero {
    public Tank(int attackP, int defenceP, int healthP){
        super(attackP, defenceP, healthP);
    }

    public int attack(){
        return (int) (getAttackPoints() * 1.5);
    }

    public int defence(int attack){
        return (int) (getDefence() + attack / 2);
    }
}
