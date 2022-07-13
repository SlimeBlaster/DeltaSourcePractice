package HeroGame;

public class Assassin extends Hero {
    public Assassin(int attackP, int defenceP, int healthP){
        super(attackP, defenceP, healthP);
    }

    public int attack(){
        return (int) (getAttackPoints() * 4);
    }
}
