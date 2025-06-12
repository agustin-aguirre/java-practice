//Ejercicio 2: Herencia
//
//Objetivo: Crear una clase base Animal con un método hacerSonido(). Luego crear dos clases hijas:
//
//Perro → imprime "Guau"
//
//Gato → imprime "Miau"
//
//En un main, crea instancias de ambas y llama al método hacerSonido().

//Objetivo: Usa el mismo código del ejercicio anterior, pero ahora:
//
//Crea un arreglo o lista de tipo Animal.
//
//Llénala con instancias de Perro y Gato.
//
//Recorre la lista y llama al método hacerSonido() para cada uno.

import java.util.Random;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) {
        var animals = generateRandomAnimals();
        for (var animal : animals) {
            animal.makeSound();
        }
    }

    private static Animal[] generateRandomAnimals(){
        var arrayLength = new Random().nextInt(10, 20);
        return IntStream.range(0, arrayLength)
                .mapToObj(i -> i % 2 == 0 ? new Dog() : new Cat())
                .toArray(Animal[]::new);
    }
}