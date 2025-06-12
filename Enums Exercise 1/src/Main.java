//✅ 1. Días de la semana con switch
//
//Objetivo: Usar enum con una estructura switch.
//
//Enunciado:
//Crea un enum llamado DiaSemana con los valores: LUNES, MARTES, ..., DOMINGO. Escribe un método que reciba un día y diga si es laborable o fin de semana.
//
//public enum DiaSemana {
//    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
//}



public class Main {
    public static void main(String[] args) {
        for (var day : WeekDay.values()) {
            printIsWorkingDay(day);
        }
    }

    private static void printIsWorkingDay(WeekDay day) {
        System.out.printf("Is %s a working day? %b%n", day.name(), day.isWorkingDay());
    }
}