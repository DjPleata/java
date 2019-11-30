
import javax.net.ssl.SSLSessionBindingEvent;
import javax.swing.*;
import java.rmi.AlreadyBoundException;

public class Program {
    public static void main(String[] args) {
        Person alex = new Person("Alexandru" , 20, 175 , 10);

        Student Andrei= new Student("Andrei", 25,180 ,100 ,"A");
        Andrei.grow(10);
            if(Andrei instanceof Student){
                System.out.println(Andrei.getName()+ " Este student");
            }
            else
                System.out.println("Saracule");

        System.out.println(Andrei.getHeight());
        System.out.println(Andrei.toString());


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

    }



    }
