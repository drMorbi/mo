package day11.task2;

public class Paladin extends Hero implements Healer {

    public Paladin() {
        physAtt = 15;
        physDef = 0.5;
        magicDef = 0.2;
    }

    private int healthSelf = 25;
    private int healthTeam = 10;

    @Override
    public void healHimself() {
        if (health + healthSelf > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else
            health += healthSelf;
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + healthTeam > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else
            hero.health += healthTeam;
    }

    public String toString() {
        return "Paladin " + "{health = " + health + "}";
    }
}
