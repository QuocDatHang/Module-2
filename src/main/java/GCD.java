import java.util.Scanner;
//GCD - Greatest Common Divisor
public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = input.nextInt();
        System.out.println("Input b: ");
        int b = input.nextInt();
        System.out.println("GCD: " + findGCD(a,b));
    }

    public static int findGCD(int a1, int b1){
        if (a1 % b1 == 0){
            return b1;
        }
        else {
//            int r = a1 % b1;
            return findGCD(b1,a1%b1);
        }

    }
}


