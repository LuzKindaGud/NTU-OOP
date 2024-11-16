package Ex6_06;

public class Main {
    public static void main(String[] args) {
        // Test the Cat class
        Cat cat = new Cat("Whiskers");
        System.out.println("Testing " + cat.getClass().getSimpleName() + " with name: " + cat.name);
        cat.greets();

        // Test the Dog class
        Dog dog = new Dog("Buddy");
        System.out.println("\nTesting " + dog.getClass().getSimpleName() + " with name: " + dog.name);
        dog.greets();

        // Test the BigDog class
        BigDog bigDog = new BigDog("Max");
        System.out.println("\nTesting " + bigDog.getClass().getSimpleName() + " with name: " + bigDog.name);
        bigDog.greets();

        // Test interactions between Dog and BigDog
        System.out.println("\nTesting interactions between Dog and BigDog:");
        dog.greets();
        dog.greets((Dog) bigDog);
        bigDog.greets();
        bigDog.greets((Dog) dog);
        bigDog.greets((BigDog) bigDog);
    }
}
