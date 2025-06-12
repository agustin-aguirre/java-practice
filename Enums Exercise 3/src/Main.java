//Ejercicio 3: Singleton con enum
//🎯 Objetivo: Implementar el patrón Singleton usando enum.
//
//        Es la forma más segura y recomendada de implementar un singleton.
//        Esto garantiza:
//          que haya una sola instancia,
//          es thread-safe, y además
//          es resistente a la serialización y reflexión.
//
//📝 Enunciado:
//
//Crea un enum llamado ConfiguracionGlobal que actúe como un singleton y almacene parámetros como:
//
//Modo debug (boolean)
//
//Versión de la aplicación (String)
//
//Agrega métodos get/set para el modo debug y solo get para la versión.


public class Main {
    public static void main(String[] args) {
        System.out.println(GlobalConfig.INSTANCE);
        GlobalConfig.INSTANCE.isDebugMode(true);
        System.out.println(GlobalConfig.INSTANCE);
    }
}