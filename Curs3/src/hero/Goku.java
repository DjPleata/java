package hero;

public class Goku extends hero{


    public Goku(String name, int hp, int mana) {
        super(name, hp, mana);
    }

    @Override
    public void fierPrimary(hero hero) {
        mana -=5;
        hero.reciveHit(5);

    }

    @Override
    public void fierSecundary(hero hero) {
        mana -=40;
        hero.reciveHit(30);

    }

    @Override
    public void reciveHit(int power) {
        hp -= power / 2 ;
        mana +=3;

    }
}
