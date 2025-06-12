public class Circle extends GeometricShape {
    Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double calcArea() {
        return Math.PI * radius;
    }
}
