import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("MENU :");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
        int choice;
        do {
            choice = input.nextInt();
            if ((choice > 2) && (choice <0)){
                System.out.println("Please choose again");
            }
        }
        while ((choice > 2) && (choice <0));
        switch (choice){
            case 1:
                fromFahrenheitToCelsius();
                break;
            case 2:
                fromCelsiusToFahrenheit();
            case 0:
                System.exit(0);
        }
    }

    public static void fromFahrenheitToCelsius(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Fahrenheit: ");
        float fahrenheit = input.nextFloat();
        float celsius = (float) (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Fahrenheit to Celsius :" + celsius);
    }

    public static void fromCelsiusToFahrenheit(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Fahrenheit: ");
        float celsius = input.nextFloat();
        float fahrenheit = (float) (celsius * 9 / 5) + 32;
        System.out.println("Celsius to Fahrenheit :" + fahrenheit);
    }
}
