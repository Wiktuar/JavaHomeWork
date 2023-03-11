package seminar1.child;

import seminar1.parent.Animal;

public class Crow extends Animal {
    public Crow(String color, int legsCount){
        super(color, legsCount);
    }

    @Override
    public void swim(){
        System.out.println(getType() + ": не может плавать");
    }
}
