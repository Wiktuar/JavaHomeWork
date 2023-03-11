package seminar1.child;

import seminar1.parent.Animal;

public class Dog extends Animal {

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.printf("%s сказал: Гав!%n", getType());
    }

    @Override
    public void fly(){
        System.out.println(getType() + ": не может летать");
    }
}
