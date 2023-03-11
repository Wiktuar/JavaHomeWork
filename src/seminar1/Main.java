import seminar1.child.Dog;
import seminar1.child.Duck;
import seminar1.child.Whale;
import seminar1.parent.Animal;
import seminar1.child.Cat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat("Vaska", "white");
        animal.fly();
        Whale whale = new Whale("blach", 0);
        System.out.println(whale.getLegsCount());
        System.out.println(whale.getName());
    }
}
