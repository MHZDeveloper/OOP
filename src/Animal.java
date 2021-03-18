public abstract class Animal {

    //attributes
    protected String name;
    private boolean hungry;
    private boolean energy;

    public Animal() {
        System.out.println("Construction");
    }

    public Animal(String name) {
        this.name = name;
    }

    //methods
    public void eat() {
        hungry = false;
        energy = true;
    }

    public abstract void say();
}
