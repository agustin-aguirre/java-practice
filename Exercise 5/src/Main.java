//Ejercicio 5: Interfaces
//
//Objetivo: Crea una interfaz Conducible con un método conducir().
//
//Crea dos clases que la implementen:
//
//Coche → imprime "Conduciendo un coche"
//
//Bicicleta → imprime "Pedaleando la bicicleta"
//
//En el main, crea una lista de Conducible y ejecuta conducir() para cada objeto.


import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        var drivables = generateDrivables();
        for (var drivable : drivables) {
            drivable.drive();
        }
    }

    private static Drivable[] generateDrivables() {
        var arrayLength = new Random().nextInt(10, 20);
        return IntStream.range(0, arrayLength).mapToObj(i -> i % 2 == 0 ? new Bicycle() : new Car()).toArray(Drivable[]::new);
    }
}