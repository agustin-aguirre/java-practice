//🔁 Ejercicio 2: Eliminar Duplicados (HashSet)
//
//Descripción:
//Dado un array de números enteros, elimina los duplicados y muestra los números únicos usando un HashSet.
//
//Puntos clave:
//
//Uso de HashSet
//
//Conversión entre arrays y colecciones


import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        var allNumbers = generateRandomInts();
        System.out.println(allNumbers.toString());

        Set<Integer> repeatedRemoved = new HashSet<Integer>((Collection<? extends Integer>) allNumbers);
        System.out.println(repeatedRemoved.toString());
    }

    private static int getRandomNatural(int maxBound) {
        return new Random().nextInt(0, maxBound);
    }

    private static Iterable<Integer> generateRandomInts() {
        var arrayLength = getRandomNatural(100);
        return IntStream.range(0, arrayLength)
                .map(i -> getRandomNatural(15))
                .boxed()
                .toList();
    }
}
