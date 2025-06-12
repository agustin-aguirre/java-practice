//Ejercicio 5: Wildcards ? super
//
//Escribe un método que reciba List<? super Integer> y le agregue varios Integer.
//
//public static void agregarNumeros(List<? super Integer> lista)
//
//Luego imprime la lista (si puedes).

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void addNumbers(List<? super Integer> integers) {
        var rand = new Random();
        var iters = rand.nextInt(10, 20);
        for (int i = 0; i < iters; i++) {
            integers.addLast(rand.nextInt());
        }
    }

    public static void main(String[] args) {
//        var numbers = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
//        numbers.forEach(System.out::println);
//        System.out.println("\n");
//        addNumbers(numbers);
//        numbers.forEach(System.out::println);
        new Subclase().metodo();
    }
}
