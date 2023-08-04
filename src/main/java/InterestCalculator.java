import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        System.out.println("Enter investment amount:");
        money = input.nextDouble();
        System.out.println("Enter number of month:");
        month = input.nextInt();
        System.out.println("Enter interest rate:");
        interestRate = input.nextDouble();

        double totalInterest = 0;
        totalInterest = money * interestRate / 100 /12 * month;
        System.out.println("TotalInterest is : ");
        System.out.println(totalInterest);
    }
}
