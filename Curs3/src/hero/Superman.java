package hero;

public class Superman extends hero {
    public Superman(String name, int hp, int mana) {
        super(name, hp, mana);
    }

    @Override
    public void fierPrimary() {
        mana -=10;
        hp++;
    }

    @Override
    public void fierSecundary() {
        mana -=30;
        hp +=3;

    }

    @Override
    public void reciveHit() {
        hp--;
    }
}
