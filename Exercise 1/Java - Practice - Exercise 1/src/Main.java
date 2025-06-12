//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//Ejercicio 1: Clase Libro
//
//Crea una clase Libro que tenga los siguientes atributos privados:
//titulo (String)
//autor (String)
//anioPublicacion (int)
//
//Agrega:
//Un constructor para inicializar todos los campos.
//Métodos get y set para cada atributo.
//Un método mostrarInformacion() que imprima los detalles del libro.

public class Main {
    public static void main(String[] args) {

        var books = new Book[] {
            new Book("Cien años de soledad", "Gabriel García Márquez", 1967),
            new Book("1984", "George Orwell", 1949),
            new Book("Orgullo y prejuicio", "Jane Austen", 1813),
            new Book("El ingenioso hidalgo Don Quijote de la Mancha (Parte 1)", "Miguel de Cervantes Saavedra", 1605),
            new Book("Historia de la eternidad", "Jorge Luis Borges", 1936)
        };

        for (var book : books) {
            book.printInformation();
        }
    }
}