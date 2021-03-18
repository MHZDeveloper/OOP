public class Fish extends Animal {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("the fish " + name + " is eating");
        super.eat();
    }

    @Override
    public void say() {
        System.out.println("Splash");
    }
}
