package seminar1.child;

import seminar1.parent.Animal;

public class Duck extends Animal {
    public Duck(String color, int legsCount) {
        super(color, legsCount);
    }

    @Override
    public void speak() {
        System.out.printf("%s сказал: Кря!%n", getType());
    }

    public void fly() {
        System.out.printf("%s полетел!%n", getType());
    }
}
