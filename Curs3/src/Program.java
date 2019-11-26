
import javax.net.ssl.SSLSessionBindingEvent;
import java.rmi.AlreadyBoundException;

public class Program {
    public static void main(String[] args) {
        Person alex = new Person("Alexandru" , 20, 175 , 10);

        System.out.println(alex.getName() + " are energia " + alex.getAge() + " de ani");

        alex.run();
        alex.run();
        alex.run();
        System.out.println(alex.getName() + " are " + alex.getStamina());
        alex.sleep();
        System.out.println(alex.getName() + " are " + alex.getStamina());

        if (alex.isMajor()){
            System.out.println(alex.getName() + "reinnk bear");
        }

        Dog lessie = new Dog();
        lessie.size = 20;
        lessie.bark();
    }



    }
