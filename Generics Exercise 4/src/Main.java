//Ejercicio 4: Wildcards ? extends
//
//Escribe un método:
//
//public static void imprimirSuma(List<? extends Number> numeros)
//
//Debe sumar todos los valores (usando doubleValue()) y mostrar el resultado.

import java.util.List;

public class Main {

    public static void printSum(List<? extends Number> numbers){
        var result = numbers.stream().mapToDouble(Number::doubleValue).average().orElse(0.0);
        System.out.println(result);
    }


    public static void main(String[] args){
        printSum(List.of(7, 5.5, 88, 99.1, Math.PI));
    }
}
