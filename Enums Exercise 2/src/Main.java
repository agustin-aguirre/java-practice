//✅ 2. Prioridades de tareas
//
//Objetivo: Asociar valores a constantes de enum.
//
//Enunciado:
//Crea un enum llamado Prioridad con los valores: BAJA, MEDIA, ALTA, CRÍTICA.
//Cada nivel tiene un número asociado (1 a 4).
//Muestra cómo acceder a ese valor.
//
//public enum Prioridad {
//    BAJA(1), MEDIA(2), ALTA(3), CRITICA(4);
//}
//
//Método sugerido:
//
//public int getNivel()


public class Main {
    public static void main(String[] args) {
        System.out.println("Name\t\t| Level");
        for (var priority : Priority.values()) {
            System.out.printf("%s\t\t| %d%n", priority.name(), priority.getLevel());
        }
    }
}