import java.util.Scanner;

/**
 * Driver class — creates two Dog objects and computes their average weight in kg.
 */
public class Kennel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dog dog1 = new Dog();
        System.out.print("Enter the 1st Dog name: ");
        String name = sc.nextLine();
        System.out.print("Enter the 1st Dog weight: ");
        double weight = sc.nextDouble();
        sc.nextLine();
        dog1.setName(name);
        dog1.setWeight(weight);

        Dog dog2 = new Dog();
        System.out.print("Enter the 2nd Dog name: ");
        name = sc.nextLine();
        System.out.print("Enter the 2nd Dog weight: ");
        weight = sc.nextDouble();
        dog2.setName(name);
        dog2.setWeight(weight);

        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        System.out.println("Average weight in kilograms: " + (dog1.toKgs() + dog2.toKgs()) / 2);
    }
}
