import java.util.Scanner;

public class Prime100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int n=2; n <= 100; n++){
            boolean flag = true;
            if (n == 2){
                System.out.println(n);
                n++;
            }
            for (int i=2; i <= Math.sqrt(n); i++){
                if (n % i == 0){
                    flag = false;
                    break;
                }
                else {
                    flag = true;
                }
            }
            if (flag){
                System.out.println(n);
            }
        }
    }
}
