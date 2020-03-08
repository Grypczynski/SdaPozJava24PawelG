package zJavaZaawansowana.zajecia8.KalkulatorPól;

public class Triangle extends Polygon {

    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    public Triangle(double a, double h) {
        this.a = a;
        this.b = h;
        this.h = h;
    }

    @Override
    public double getArea() {
        return a * h / 2.0;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public int getNumberOfEdges() {
        return 3;
    }
}
