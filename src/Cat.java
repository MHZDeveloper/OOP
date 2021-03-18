public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("the cat " + name + " is eating");
        super.eat();
    }

    @Override
    public void say() {
        System.out.println("Miaou");
    }
}
