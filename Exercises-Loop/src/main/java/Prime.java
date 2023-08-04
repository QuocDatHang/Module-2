import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number of prime :");
        int number = input.nextInt();
        int n = 2;
        int count = 0;
        while (count <= number){
            boolean flag = true;
            if (n == 2){
                count++;
                n++;
            }
            for (int i=2; i < n; i++){
                if (n % i == 0){
                    flag = false;
                    n++;
                    break;
                }
                else {
                    flag = true;
                }
            }
            if (flag){
                System.out.println(n + " is a prime");
                count++;
                n++;
            }
        }
    }
}
