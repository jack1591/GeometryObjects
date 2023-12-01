import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*String[] array = new String[]{"5","3","7","1","2"};
        StringComparator stringComparator = new StringComparator();
        Arrays.sort(array,stringComparator);
        System.out.println(Arrays.toString(array));
        */

        /*Socks[] socks = new Socks[]{new Socks(2, Color.CYAN,"coton"),new Socks(3, Color.CYAN,"bamboo"),new Socks(2, Color.CYAN,"metal")};
        Arrays.sort(socks);
        System.out.println(Arrays.toString(socks));
         */

        GeometryObjects[] geometryObjects = new GeometryObjects[]{new Kvadrat(1,1),new Triangle(1,1,1), new Circle(2)};
        Arrays.sort(geometryObjects);
        System.out.println(Arrays.toString(geometryObjects));
        geometryObjects[0].setScale(100);
        Arrays.sort(geometryObjects);
        System.out.println(Arrays.toString(geometryObjects));

        /*
        Circle c = (Circle)geometryObjects[2];
        Triangle t = (Triangle) geometryObjects[1];


        if (geometryObjects[2] instanceof Circle){
            Circle c1 = (Circle)geometryObjects[2];
            System.out.println(c1);
        }

         */
    }
}