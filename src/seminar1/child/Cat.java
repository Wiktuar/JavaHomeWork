package seminar1.child;

import seminar1.parent.Animal;

public class Cat extends Animal {
    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void fly(){
        System.out.println(getType() + ": не может летать");
    }

    @Override
    public void swim(){
        System.out.println(getType() + ": не может плавать");
    }

    @Override
    public void speak() {
        System.out.printf("%s сказал: Meow!%n", getType());
    }

    @Override
    public void hunt() {
        wakeUp();
        findFood();
        eat();
        toPlay();
        goToSleep();
    }

    @Override
    public String toString() {
        return String.format(
                "%s {name: %s,%ncolor: %s,%nlegs: %s;%n}", getType(), getName(), getColor(), getLegsCount()
        );
    }

    @Override
    public void wakeUp() {
        System.out.println(getType() + ": проснулся");
    }

    @Override
    public void findFood() {
        String out = String.format("%s: нашел еду%n", getType());
        System.out.println(out);
    }

    @Override
    public void eat() {
        System.out.printf("%s: поел%n", getType());
    }

    @Override
    public void toPlay() {
        System.out.printf("%s: поиграл%n", getType());
    }

    @Override
    public void goToSleep() {
        System.out.printf("%s: уснул%n", getType());
    }
}
