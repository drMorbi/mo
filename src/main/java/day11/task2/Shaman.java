package day11.task2;

public class Shaman extends Hero implements Healer, PhysAttack, MagicAttack {

    public Shaman() {
        physAtt = 10;
        physDef = 0.2;
        magicDef = 0.2;
    }

    private int magicAtt = 15;
    private int healthSelf = 50;
    private int healthTeam = 30;

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

    @Override
    public void magicalAttack(Hero hero) {
        double attack = magicAtt - magicAtt * hero.magicDef;
        if (hero.health - attack < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attack;
        }
    }


    public String toString() {
        return "Shaman " + "{health = " + health + "}";
    }
}
