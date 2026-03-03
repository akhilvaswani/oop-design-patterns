import java.util.Scanner;

/**
 * Creates executives from user input and awards bonuses.
 * Throws BonusTooLowException if bonus <= 2000.
 */
public class Problem1 {

    public static void main(String[] args) throws BonusTooLowException {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the number of executives to enter: ");
        int n = kb.nextInt();
        kb.nextLine();

        Executive[] executives = new Executive[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter data for Executive " + (i + 1) + ":");
            System.out.print("Name: ");
            String eName = kb.nextLine();
            System.out.print("Address: ");
            String eAddress = kb.nextLine();
            System.out.print("Phone number: ");
            String ePhone = kb.nextLine();
            System.out.print("Social Security Number: ");
            String socSecNumber = kb.nextLine();
            System.out.print("Enter payment rate: ");
            double rate = kb.nextDouble();
            kb.nextLine();

            executives[i] = new Executive(eName, eAddress, ePhone, socSecNumber, rate);
        }

        System.out.println("Award bonus for each Executive:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter bonus for Executive " + (i + 1) + ": ");
            double bonus = kb.nextDouble();

            if (bonus > 2000)
                executives[i].awardBonus(bonus);
            else
                throw new BonusTooLowException("Bonus must be greater than 2000");
        }
    }
}
