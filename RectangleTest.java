import java.awt.Rectangle;
import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(10, 10, 40, 30);
        System.out.println("box1: " + box1);

        Rectangle box2 = new Rectangle(0, 0, 100, 50);
        System.out.println("Box2: " + box2);

        box1.move(20, 20);

        box2.resize(50, 3);

        System.out.println("box1: " + box1);
        System.out.println("Box2: " + box2);

        Rectangle box3 = new Rectangle(box1.intersection(box2));
        System.out.println(box3);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter width: "); 
        int width = input.nextInt();

        System.out.println("Enter height: ");
        int height = input.nextInt();

        double area = box3.getWidth() * box3.getHeight();
        System.out.println("Area: " + area + "of box 3");
       
    }

}