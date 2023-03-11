package seminar1.parent;

public class Animal {
    private String name;
    private final String color;
    private int legsCount;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
        this.legsCount = 4;
    }

    public Animal(String color, int legsCount) {
        this("Безымянный", color);
        this.legsCount = legsCount;
    }

    public Animal() {
        this("Безымянный", "чёрный");
    }

    public void togo(){
        System.out.println(getType() + ": бегать");
    }

    public void fly(){
        System.out.println(getType() + ": летает");
    }

    public void swim(){
        System.out.println(getType() + ": плавает");
    }

    public void wakeUp() {
        System.out.println(getType() + ": проснулся");
    }

    public void findFood() {
        String out = String.format("%s: нашел еду%n", getType());
        System.out.println(out);
    }

    public void eat() {
        System.out.printf("%s: поел%n", getType());
    }

    public void toPlay() {
        System.out.printf("%s: поиграл%n", getType());
    }

    public void goToSleep() {
        System.out.printf("%s: уснул%n", getType());
    }

    public void speak() {
        System.out.printf("%s: ...%n", getType());
    }

    public void hunt() {}

    //todo: Ниже геттеры и сеттеры. !!! Обратите внимание, не к каждому полю есть сеттер(один из шагов инкапсуляции)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public int getLegsCount() {
        return legsCount;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }
}
