import java.util.ArrayList;
import java.util.Scanner;

public class UserInputsReader {

    public ArrayList<String> ReadNames() {
        var names = new ArrayList<String>();
        var scanner = new Scanner(System.in);
        var input = scanner.nextLine();
        while (!input.equalsIgnoreCase("end")) {
            names.addLast(input);
            input = scanner.nextLine();
        }
        return names;
    }
}
