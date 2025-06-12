public class Utils {
    public static <T> void printList(Iterable<T> iterable){
        for (var element : iterable) {
            System.out.println(element);
        }
    }
}
