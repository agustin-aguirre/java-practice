public class Rectangle extends GeometricShape {
    Double base;
    Double height;

    public Rectangle(Double base, Double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public Double calcArea() {
        return base * height;
    }
}
