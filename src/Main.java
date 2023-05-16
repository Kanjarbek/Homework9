public class Main {
    public static void main(String[] args) {
     Animal  shark1 = new Shark("Shark1");
     Animal  shark2 = new Shark("Shark2");
     Animal  shark3 = new Shark("Shark3");
     Animal  eagle1 = new Eagle("Eagle1");
     Animal  eagle2 = new Eagle("Eagle2");
     Animal  eagle3 = new Eagle("Eagle3");
     Animal  turtle1 = new Turtle("Turtle1");
     Animal  turtle2 = new Turtle("Turtle2");
     Animal  turtle3 = new Turtle("Turtle3");

     Animal [] animals = {shark1,eagle1,turtle1,shark2,eagle2,turtle2,shark3,eagle3,turtle3};


     Animal [] sharks = {shark1,shark2,shark3};
     Animal [] eagles = {eagle1,eagle2,eagle3};
     Animal [] turtles = {turtle1,turtle2,turtle3};

        for (int i = 0; i < sharks.length; i++) {
            sharks[i].doSomething();
        }
        for (int i = 0; i < eagles.length; i++) {
            eagles[i].doSomething();

        }

        for (int i = 0; i < turtles.length; i++) {
            turtles[i].doSomething();

        }






    }
}