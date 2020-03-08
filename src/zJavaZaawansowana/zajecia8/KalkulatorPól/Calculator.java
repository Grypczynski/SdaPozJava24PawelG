package zJavaZaawansowana.zajecia8.KalkulatorPól;

import java.util.Random;

public class Calculator {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[20];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = getRandomShape();
        }

        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }
    }

    private static Shape getRandomShape() {
        Random random = new Random();
        switch (random.nextInt(4)) {
            case 0:
                return new Triangle(random.nextDouble(), random.nextDouble(), random.nextDouble(), random.nextDouble());
            case 1:
                break;
        }
        return null;
    }
}
