//📖 Ejercicio 3: Diccionario Personal (HashMap)
//
//Descripción:
//Crea un diccionario simple usando HashMap<String, String>. El programa debe permitir al usuario:
//
//Agregar palabras y sus definiciones
//
//Consultar definiciones por palabra
//
//Salir con un comando
//
//Puntos clave:
//
//Uso de HashMap
//
//Búsqueda y modificación


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var personalDict = new PersonalDictionary();
        var scanner = new Scanner(System.in);

        while (readUserOption(scanner) != 0) {
            var word = readUserWord(scanner);
            var def = readDefinition(scanner);
            personalDict.AddWord(word, def);
        }

        System.out.println(personalDict.getWords().toString());

    }

    private static int readUserOption(Scanner scanner) {
        System.out.println("""
                    Options:
                    1) Add word with definition.
                    0) Finish and print.
                    """);
        return scanner.nextInt();
    }

    private static String readUserWord(Scanner scanner) {
        var word = "";
        while (word.isEmpty()) {
            System.out.print("Word: ");
            word = scanner.nextLine();
        }
        return word;
    }

    private static String readDefinition(Scanner scanner) {
        System.out.print("Definition: ");
        var def = scanner.nextLine();
        if (def.isEmpty())
            def = "<No definition added>";
        return def;
    }
}
