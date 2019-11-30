package hero;

public class game {
    public static void main(String[] args) {
        Goku hero1 = new Goku("Goku", 400, 200);
        Mage hero2 = new Mage("China",200,800 );
        Superman hero3 = new Superman("Clarc", 500, 300);


        hero1.fierPrimary();
        hero2.reciveHit();
        hero3.reciveHit();

        hero2.fierSecundary();
        hero1.reciveHit();
        hero1.reciveHit();
        hero3.reciveHit();

        hero3.fierPrimary();
        hero2.reciveHit();
        hero1.reciveHit();

        System.out.println(hero1.toString());
        System.out.println(hero2.toString());
        System.out.println(hero3.toString());
    }
}
