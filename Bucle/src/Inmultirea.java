import java.util.Scanner;

public class Inmultirea {
    public static void main(String[] args) {
        System.out.println("introduceti numarul");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        while (i <=9) {
            System.out.println(i + "x" + n + " = " + i * n);
            i++;

}
        for (i = 1; i <= 9; i++) {
            System.out.println(i + "x" + n + " = " + i * n);
        }
    }
}
