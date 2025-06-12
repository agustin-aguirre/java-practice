import java.util.stream.StreamSupport;


public class AveragesCalculator <T extends Number> {
    Iterable<T> elements;

    public AveragesCalculator(Iterable<T> numbers) {
        elements = numbers;
    }

    public Double calcAverage() {
        return StreamSupport.stream(elements.spliterator(), false)
                .mapToDouble(Number::doubleValue)
                .average()
                .orElse(0.0);
    }
}
