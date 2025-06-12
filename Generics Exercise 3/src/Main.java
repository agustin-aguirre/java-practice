//Ejercicio 3: Restricción con extends
//
//Crea una clase CalculadoraPromedio<T extends Number> que acepte una lista
//de números (Integer, Double, etc.) y calcule su promedio.


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var calculator = new AveragesCalculator<Integer>(List.of(
           7,7,7,7,9,9,9,9,10,10,7,7,7
        ));

        System.out.println(calculator.calcAverage());
    }
}
