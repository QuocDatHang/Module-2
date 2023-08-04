//package Rectangle;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input width: ");
        float width = input.nextFloat();
        System.out.print("Input height: ");
        float height = input.nextFloat();
        Rectangle object = new Rectangle(width, height);
        System.out.println(object.getArea());
        System.out.println(object.getPerimeter());
        System.out.println(object.display());
    }
}
