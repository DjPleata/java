package Exceptions;

public class Demo {
    public static void main(String[] args) {
        try {
            int a = 1 / 0;
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("impartire nu poete fi facuta");
        }
    }
}
