package HeroGame;

public class Warrior extends Hero {
    public Warrior(int attackP, int defenceP, int healthP){
        super(attackP, defenceP, healthP);
    }

    public int attack(){
        return (int) (getAttackPoints() * 2);
    }
}
