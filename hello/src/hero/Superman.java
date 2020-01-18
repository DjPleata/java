package hero;

public class Superman extends hero {
    public Superman(String name, int hp, int mana) {
        super(name, hp, mana);
    }

    @Override
    public void fierPrimary(hero hero) {
        mana -=10;
        hp++;
        hero.reciveHit(20);
    }

    @Override
    public void fierSecundary(hero hero) {
        mana -=30;
        hp +=3;
        hero.reciveHit(60);

    }

    @Override
    public void reciveHit(int power) {
        if(power < 25){
            mana ++;
        } else
        hp-= power/3;
    }
}
