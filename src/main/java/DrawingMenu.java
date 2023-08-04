import java.util.Scanner;

public class DrawingMenu {
    public static void main(String[] args) {
        int choice = 4;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();

        switch (choice){
            case 1:
                for (int i=0; i < 3; i++){
                    for (int j=0; j < 7; j++){
                        if (j == 6){
                            System.out.println("* ");
                        }
                        else {
                            System.out.printf("* ");
                        }
                    }
                }
                break;
            case 2:
                for (int i=1; i <= 5; i++){
                    for (int j=1; j <= i; j++){
                        if (j == i){
                            System.out.println("* ");
                        }
                        else {
                            System.out.printf("* ");
                        }
                    }
                }
                for (int i=1; i < 6; i++){
                    for (int j=1; j < 6; j++){
                        if (j == 5){
                            System.out.println("* ");
                        }
                        else if (i <= j){
                            System.out.printf("* ");
                        }
                        else {
                            System.out.printf("  ");
                        }
                    }
                }
                for (int i=5; i > 0; i--){
                    for (int j=i; j > 0; j--){
                        if (j == 1){
                            System.out.println("* ");
                        }
                        else {
                            System.out.printf("* ");
                        }
                    }
                }
                for (int i=1; i < 6; i++){
                    for (int j=1; j < 6; j++){
                        if (j == 5){
                            System.out.println("* ");
                        }
                        else if (i+j >= 6){
                            System.out.printf("* ");
                        }
                        else {
                            System.out.printf("  ");
                        }
                    }
                }
                break;
            case 3:
                for (int i=1; i <= 5; i++){
                    for (int j=1; j <= 5-i; j++){
                        System.out.printf("  ");
                    }
                    for (int k=1; k <= 2 * i - 1; k++){
                        System.out.printf("* ");
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.exit(0);
        }
    }
}
