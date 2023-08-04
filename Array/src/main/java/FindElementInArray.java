import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] students = {"Ronaldo", "Kaka", "Zidane", "Neymar"};
        System.out.print("Find Student: ");
        String name = input.nextLine();
        boolean check = false;
        for (int i=0; i < students.length; i++){
            if (students[i].equals(name)){
                check = true;
                System.out.println("Position of " +students[i]+ "in Students List is:" + (i+1) );
                break;
            }
        }
        if (!check){
            System.out.println("Not found " + name + " in Students List");
        }
    }
}
