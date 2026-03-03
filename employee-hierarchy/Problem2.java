import java.util.Scanner;

/**
 * Same as Problem1 but with proper try-catch handling.
 * Counts valid bonuses and calculates average pay across all executives.
 */
public class Problem2 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter the number of executives to enter: ");
        int n = kb.nextInt();
        kb.nextLine();

        Executive[] executives = new Executive[n];
        int nValidBonus = 0;

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

            try {
                if (bonus > 2000) {
                    executives[i].awardBonus(bonus);
                    nValidBonus++;
                } else {
                    throw new BonusTooLowException("Bonus must be greater than 2000");
                }
            } catch (BonusTooLowException e) {
                System.out.println("Bonus must be greater than 2000. Bonus for Executive " + (i + 1) + " is 0.");
            }
        }

        System.out.println("Number of executives with valid bonus: " + nValidBonus);

        double totalPay = 0;
        for (int i = 0; i < n; i++) {
            totalPay += executives[i].pay();
        }

        System.out.printf("Average pay: %.2f%n", totalPay / n);
    }
}
