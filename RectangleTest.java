import java.awt.Rectangle;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(10, 10, 40, 30);
        System.out.println("box1: " + box1);

        Rectangle box2 = new Rectangle(0, 0, 100, 50);
        System.out.println("Box2: " + box2);

        box1.move(20, 20);

        box2.resize(50, 30);

        System.out.println("box1: " + box1);
        System.out.println("Box2: " + box2);

        Rectangle box3 = new Rectangle(box1.intersection(box2));
        System.out.println(box3);



    }

}