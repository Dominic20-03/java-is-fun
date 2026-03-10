public class Main {
    public static void main(String[] args) {

        Organism org = new Organism();
        Plant pl = new Plant();
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(org.isAlive);
        System.out.println(pl.isAlive);
        System.out.println(animal.isAlive);
        System.out.println(dog.isAlive);

        pl.photosynthesis();
        animal.eat();

        dog.speak();
        cat.speak();

        System.out.println(dog.lives);
        System.out.println(cat.lives);

    }
}
