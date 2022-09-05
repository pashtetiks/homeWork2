import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    private static Person[] RAW_DATA = new Person[]{
            new Person(0, "Harry"),
            new Person(0, "Harry"), // дубликат
            new Person(1, "Harry"), // тёзка
            new Person(2, "Harry"),
            new Person(3, "Emily"),
            new Person(4, "Jack"),
            new Person(4, "Jack"),
            new Person(5, "Amelia"),
            new Person(5, "Amelia"),
            new Person(6, "Amelia"),
            new Person(7, "Amelia"),
            new Person(8, "Amelia"),
    };
    public static void main(String[] args) {
        System.out.println("Raw data:");
        System.out.println();

        for (Person person : RAW_DATA) {
            System.out.println(person.id + " - " + person.name);
        }

        System.out.println();
        System.out.println("**************************************************");
        System.out.println();
        System.out.println("Duplicate filtered, grouped by name, sorted by name and id:");
        System.out.println();

        Map<String , Map<Integer, List<Person>>> sortedData = Arrays.stream(RAW_DATA)
                .distinct()
                .collect(Collectors.groupingBy(Person::getName,
                        Collectors.groupingBy(Person::getId)));

        for(String key: sortedData.keySet()){
            int count = 1;
            System.out.println(key + ":");
            for(Integer id: sortedData.get(key).keySet()){
                System.out.println(count + " - " + key + " (" + id + ")");
                count++;
            }
        }
    }
}
