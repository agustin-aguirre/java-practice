//Ejercicio 4: Abstracción
//
//Objetivo: Crea una clase abstracta FiguraGeometrica con un método abstracto calcularArea().
//
//Crea dos clases que la extiendan:
//
//Rectangulo con atributos base y altura
//
//Circulo con atributo radio
//
//Implementa el método calcularArea() en cada una.


public class Main {
    public static void main(String[] args) {
        var rectangle = new Rectangle(1.0, 1.0);
        var circle = new Circle(1.0);
        printArea(rectangle, "Rectangle");
        printArea(circle, "Circle");
    }

    private static void printArea(GeometricShape shape, String name) {
        System.out.printf("Area of %s: %f%n", name, shape.calcArea());
    }
}