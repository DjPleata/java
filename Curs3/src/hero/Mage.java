package hero;

public class Mage extends hero {
    public Mage(String name, int hp, int mana) {
        super(name, hp, mana);
    }

    @Override
    public void fierPrimary(hero hero) {
        mana -= 15;
        hero.reciveHit(20);

    }

    @Override
    public void fierSecundary(hero hero) {
        mana -= 40;
        hero.reciveHit(50);

    }

    @Override
    public void reciveHit(int power) {
        hp -= 2*power;

    }
}
