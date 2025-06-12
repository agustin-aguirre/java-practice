//Ejercicio 1: Caja genérica
//
//Crea una clase Caja<T> con los siguientes métodos:
//
//void guardar(T elemento)
//
//T obtener()
//
//Instancia dos cajas: una para String y otra para Integer, y guarda/obtén datos de ambas.


public class Main {
    public static void main(String[] args) {
        var stringBox = new GenericBox<String>();
        stringBox.save("AGUSTÍN");

        var intBox = new GenericBox<Integer>();
        intBox.save(7);

        System.out.println(stringBox.get());
        System.out.println(intBox.get());
    }
}