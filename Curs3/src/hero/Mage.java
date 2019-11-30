package hero;

public class Mage extends hero {
    public Mage(String name, int hp, int mana) {
        super(name, hp, mana);
    }

    @Override
    public void fierPrimary() {
        mana -= 15;

    }

    @Override
    public void fierSecundary() {
        mana -= 40;

    }

    @Override
    public void reciveHit() {
        hp -= 30;

    }
}
