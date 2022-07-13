package HeroGame;

public class Application {
    public static void main(String[] args) {
        Assassin rengar = new Assassin(100, 20, 500);
        Tank muili = new Tank(15, 125, 1000);
        Warrior halplo = new Warrior(70, 50, 650);
        int counter = 0;

        while (halplo.getHealthPoints() > 0 && rengar.getHealthPoints() > 0) {
           counter++;
            if(counter % 2 == 0){
                initialAttack(rengar, halplo);
               System.out.println(halplo);
           }
           else{
               initialAttack(halplo, rengar);
               System.out.println(rengar);
           }
        }
    }

    public static void initialAttack(Hero attacker, Hero defender) {
        int attack = attacker.attack();
        int armor = defender.defence(attack);
        int dmgDone = attack - armor;
        defender.updateHP(defender.getHealthPoints() - dmgDone);
    }
}
