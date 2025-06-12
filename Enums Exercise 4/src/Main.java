//✅ Ejercicio 2: Strategy con enum
//🎯 Objetivo: Usar un enum para implementar el patrón Strategy (comportamiento intercambiable).
//
//📝 Enunciado:
//
//Crea un enum llamado Operacion con estrategias matemáticas: SUMA, RESTA, MULTIPLICACION, DIVISION.
//
//Cada constante debe implementar un método calcular(double a, double b).


public class Main {
    public static void main(String[] args) {
        System.out.printf("10 + 10 = %f%n", MathOperations.ADD.calculate(10,10));
        System.out.printf("10 - 10 = %f%n", MathOperations.SUBSTRACT.calculate(10,10));
        System.out.printf("10 * 10 = %f%n", MathOperations.MULTIPLY.calculate(10,10));
        System.out.printf("10 / 10 = %f%n", MathOperations.DIVIDE.calculate(10,10));
    }
}
