//Ejercicio 1: Lista de Nombres (ArrayList)
//
//Descripción:
//Crea una ArrayList<String> para almacenar nombres. Permite al usuario ingresar nombres hasta que escriba "fin".
//Luego, imprime todos los nombres ingresados en orden inverso.
//
//Puntos clave:
//
//Uso de ArrayList
//
//Iteración en reversa


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        var userInputs = new UserInputsReader();
        var names = userInputs.ReadNames();
        System.out.println(names.reversed().toString());
    }
}
