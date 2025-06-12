import java.util.*;


public class PersonalDictionary {
    Map<String, ArrayList<String>> words = new HashMap<>();

    public void AddWord(String word, String definition) {
        word = word.toLowerCase();
        words.putIfAbsent(word, new ArrayList<>());
        words.get(word).add(definition);
    }

    // patrón de exposición controlada (Controlled Exposure)
    public Map<String, Iterable<String>> getWords() {
        Map<String, Iterable<String>> result = new HashMap<>();

        for (Map.Entry<String, ArrayList<String>> entry : words.entrySet()) {
            result.put(entry.getKey(), Collections.unmodifiableList(entry.getValue()));
        }
        return Collections.unmodifiableMap(result); // aún más protección
    }

    @Override
    public String toString() {
        return words.toString();
    }
}
