import java.awt.*;

public class PiontSetter {

    public static void main(String[] args) {

        Point location = new Point(4,13);
        PiontSetter.show(location, "Położenie początkowe: ");
        PiontSetter.changePoint(location,7,6,"Przejście do (7,6)");
        PiontSetter.show(location,"Położenie końcowe");
    }

    static void show(Point point){
        System.out.println("X równe " + point.x);
        System.out.println("Y równe " + point.y);
    }

    static void show(Point point, String description){
        System.out.println(description);
        System.out.println("X równe " + point.x);
        System.out.println("Y równe " + point.y);
    }

    static void changePoint( Point point, int x, int y, String desc){
        System.out.println(desc);
        point.x = x;
        point.y = y;

         }

}
