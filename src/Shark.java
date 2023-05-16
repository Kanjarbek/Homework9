public class Shark extends Animal {

    public Shark(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println(getName()+ " is attacking");
    }
}

