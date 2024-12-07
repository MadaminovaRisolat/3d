import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Shape3DInterface> shapes = new ArrayList<>();
        Random rand = new Random();

        // Generate 10 random shapes
        for (int i = 0; i < 10; i++) {
            int shapeType = rand.nextInt(3); // 0 for Sphere, 1 for Cylinder, 2 for Cube
            switch (shapeType) {
                case 0 -> shapes.add(new Sphere());
                case 1 -> shapes.add(new Cylinder());
                case 2 -> shapes.add(new Cube());
            }
        }

        // Output details of each shape
        for (Shape3DInterface shape : shapes) {
            System.out.println(shape.toString());
            System.out.printf("Surface Area: %.2f\n", shape.surfaceArea());
            System.out.printf("Volume: %.2f\n\n", shape.volume());
        }
    }
}
