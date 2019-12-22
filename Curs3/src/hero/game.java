package hero;

public class game {
    public static void main(String[] args) {
        Goku hero1 = new Goku("Goku", 400, 200);
        Mage hero2 = new Mage("Mage",200,800 );
        Superman hero3 = new Superman("Clarc", 500, 300);


        hero1.fierPrimary(hero2);
        hero1.fierPrimary(hero3);
        hero2.fierSecundary(hero1);
        hero3.fierPrimary(hero1);

        System.out.println(hero1.toString());
        System.out.println(hero2.toString());
        System.out.println(hero3.toString());
    }
}
