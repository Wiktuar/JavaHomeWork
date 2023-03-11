package seminar1.child;

import seminar1.parent.Animal;

public class Fish extends Animal {
    public Fish(String color, int legsCount){
        super(color, legsCount);
    }

    @Override
    public void fly(){
        System.out.println(getType() + ": не может летать");
    }

    @Override
    public void togo(){
        System.out.println(getType() + ": не может бегать");
    }
}
