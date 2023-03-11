package seminar1.child;

import seminar1.parent.Animal;

public class Whale extends Animal {
    public Whale(String color, int legsCount){
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
