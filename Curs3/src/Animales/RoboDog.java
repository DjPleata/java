package Animales;

public class RoboDog  implements Animal, Pet, Robot {

    private int battery =50;
    @Override
    public void makeNoise() {
        System.out.println("Bartzzz");
    }

    @Override
    public void play() {
        System.out.println("Jattpak backflip");
    }

    @Override
    public void recharge() {
        battery=100;
    }
}
