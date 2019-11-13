import java.util.Scanner;

public class Generatii {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in)
                System.out.println("intoroduceti varsta:");
        int age = in.nextInt();
        String generatia;
        if (age < 0) {
            // generatia "Valoare incorecta";
            System.out.println("Varsta incorecta");
            return;
        }  if ( age< 6)  {
            generatia = "alfa";
            else if (age < 6) {
                generatia = "z";
            } else {
                return;

                generatia = "builders";
            }System.out.println("Generatia este"+generatia);


                }
            }
        }
    }
}
