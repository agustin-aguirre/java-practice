import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var list = Arrays.asList(new String[] {
            "AGUSTÍN",
            "ESTÁ",
            "PRACTICANDO",
            "LOS",
            "\"JAVA\"",
            "FUNDAMENTALS"
        });
        Utils.printList(list);
    }
}