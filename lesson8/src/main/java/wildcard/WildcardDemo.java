package wildcard;

import generic.Circle;
import generic.Shape;
import generic.Square;

import java.util.LinkedList;
import java.util.List;

public class WildcardDemo {
    public static void main(String[] args) {

        // ?
        List<Shape> shapes = new LinkedList<>();
        shapes.add(new Circle(1));
        shapes.add(new Square(1));
        printSize(shapes);

        // ? extends T
        List<Shape> newShapes = new LinkedList<>();
        newShapes.add(new Circle(1));
        newShapes.add(new Square(1));
        printArea(newShapes);

        // ? super T
    }

    public static void printSize(List<?> shape) {
        System.out.println("shape.size() = " + shape.size());
    }

    public static void printArea (List<? extends Shape> shapes) {
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("Circle " + shape);
            } else {
                System.out.println("Square " + shape.area());
            }
        }
    }
}
