package Animales;

public class VetProgram {

    public static void main(String[] args) {
        Bear winnie = new Bear();
        Lion simba = new Lion();
        Chicken kfc = new Chicken();
        Vet marcel = new Vet();
        RoboDog foca = new RoboDog();

        marcel.makeShot(simba);
        marcel.makeShot(kfc);
        marcel.makeShot(winnie);
        marcel.makeShot(foca);

        foca.recharge();




    }
}
