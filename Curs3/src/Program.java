import com.sun.org.apache.bcel.internal.generic.ARETURN;
import com.sun.org.apache.bcel.internal.generic.DRETURN;

import javax.net.ssl.SSLSessionBindingEvent;

public class Program {
    public static void main(String[] args) {
        Person alex = new Person();
        alex. name = "Alexandru";
        alex. age = 20;
        alex. height = 175;
        alex.age++;
        alex.stamina = 10;


        System.out.println(alex.name + " are energia " + alex.age + " de ani");

        alex.run();
        alex.run();
        alex.run();
        System.out.println(alex.name + " are " + alex.stamina);
        alex.sleep();
        System.out.println(alex.name + " are " + alex.stamina);

        if (alex.isMajor()){
            System.out.println(alex.name + "reinnk bear");
        }

        Dog lessie = new Dog();
        lessie.size = 20;
        lessie.bark();
    }



    }
