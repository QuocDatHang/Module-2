import java.util.Arrays;
import java.util.Scanner;

public class FindMaxValueInArray {
    public static void main(String[] args) {
        int[][] newArray = createMatrix();
        displayArray(newArray);
        findMaxValue(newArray);
    }

    public static void findMaxValue(int[][] arr){
        int x = 0,y = 0;
        int max = arr[0][0];
        for (int i=0; i < arr.length; i++){
            for (int j=0; j <arr[i].length; j++){
                if (arr[i][j] > max){
                    max = arr[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println("The max value in array is: " + max + " with the position: " + x +","+ y);
    }

    public static int[][] createMatrix() {
        Scanner input = new Scanner(System.in);
        int row, col;
        do{
            System.out.print("Input number of row: ");
            row = input.nextInt();
            System.out.print("Input number of column: ");
            col = input.nextInt();
        }
        while (row < 0 || col <= 0);
        int[][] array = new int[row][col];
        for (int i=0; i < row; i++){
            for (int j=0; j < col; j++){
                System.out.print("Input value with position " + i + "," + j + ": ");
                array[i][j] = input.nextInt();
            }
        }
        return array;
    }

    public static void displayArray(int[][] arr){
        System.out.println("your array = ");
        for (int i=0; i < arr.length; i++){
            for (int j=0; j < arr[i].length; j++){
                System.out.printf(arr[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}
