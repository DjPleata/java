package hero;

public class Goku extends hero{


    public Goku(String name, int hp, int mana) {
        super(name, hp, mana);
    }

    @Override
    public void fierPrimary() {
        mana -=5;

    }

    @Override
    public void fierSecundary() {
        mana -=40;

    }

    @Override
    public void reciveHit() {
        hp -=1;
        mana +=3;

    }
}
