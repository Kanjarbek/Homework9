public class Turtle extends Animal{
    public Turtle(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println(getName()+" is swimming");

    }
}
