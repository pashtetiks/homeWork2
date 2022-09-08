package task1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Dictionary {
    public Map<String, Long> sortByName(Person[] arr) {
        return Arrays.stream(arr)
                .filter(Objects::nonNull)
                .distinct()
                .collect(Collectors.groupingBy(Person::getName, Collectors.counting()));
    }
}
