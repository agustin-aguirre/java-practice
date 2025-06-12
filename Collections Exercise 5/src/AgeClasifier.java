import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class AgeClasifier {
    Map<Integer, Collection<String>> people = new HashMap<>();

    public void AddPerson(String name, int age) {
        people.putIfAbsent(age, new ArrayList<>());
        people.get(age).add(name);
    }

    @Override
    public String toString() {
        return people.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .map(entry -> String.format(
                        "Edad %d: %s",
                        entry.getKey(),
                        String.join(", ", entry.getValue())
                    ))
                .collect(Collectors.joining("\n"));
    }
}
