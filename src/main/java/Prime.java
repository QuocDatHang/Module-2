import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = a.nextInt();
        if (number < 2){
            System.out.println(number + " is not a prime");
        }
        else {
            int i = 2;
            boolean check = true;
            while (i < number){
                if (number % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println(number + "is a prime");
            }
            else{
                System.out.println(number + "is not a prime");
            }
        }
    }
}
