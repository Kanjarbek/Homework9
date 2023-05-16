public class Eagle extends Animal{

    public Eagle(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println(getName()+" is flying");
    }
}
