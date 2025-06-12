//📝 5. Clasificación por edades
//
//Objetivo: Agrupar valores con Map y List.
//
//Enunciado:
//Recoge una lista de personas con nombre y edad. Agrupa las personas por edad y muestra qué personas tienen la misma edad.
//
//Ejemplo de salida:
//Edad 25: Ana, Luis
//Edad 30: Marcos

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var ageClassifier = new AgeClasifier();
        var scanner = new Scanner(System.in);

        while (readUserOption(scanner) != 0) {
            var word = readName(scanner);
            var age = readAge(scanner);
            ageClassifier.AddPerson(word, age);
        }

        System.out.println(ageClassifier);

    }

    private static int readUserOption(Scanner scanner) {
        System.out.println("""
                    Options:
                    1) Add person with age.
                    0) Finish and print.
                    """);
        return scanner.nextInt();
    }

    private static String readName(Scanner scanner) {
        var word = "";
        while (word.isEmpty()) {
            System.out.print("Name: ");
            word = scanner.nextLine();
        }
        return word;
    }

    private static int readAge(Scanner scanner) {
        System.out.print("Age: ");
        return scanner.nextInt();
    }
}