import java.util.*;
import java.util.stream.*;

public class StreamsExample {

    public static void main(String[] args) {

        // ===== 1. Create Stream from a Collection =====
        List<String> namesList = Arrays.asList("Ravi", "Sita", "Amit", "Gita", "Ravi");
        System.out.println("Stream from List:");
        namesList.stream().forEach(name -> System.out.println(name));
        System.out.println();

        // ===== 2. Create Stream from an Array =====
        String[] namesArray = {"Ravi", "Sita", "Amit", "Gita", "Amit"};
        System.out.println("Stream from Array:");
        Arrays.stream(namesArray).forEach(name -> System.out.println(name));
        System.out.println();

        // ===== 3. Intermediate Operation: filter =====
        System.out.println("Names starting with 'A':");
        namesList.stream()
                .filter(name -> name.startsWith("A")) // only names starting with A
                .forEach(name -> System.out.println(name));
        System.out.println();

        // ===== 4. Intermediate Operation: map =====
        System.out.println("Names in uppercase:");
        namesList.stream()
                .map(name -> name.toUpperCase()) // convert each name to uppercase
                .forEach(name -> System.out.println(name));
        System.out.println();

        // ===== 5. Intermediate Operation: sorted =====
        System.out.println("Names sorted alphabetically:");
        namesList.stream()
                .sorted() // natural order
                .forEach(name -> System.out.println(name));
        System.out.println();

        // ===== 6. Intermediate Operation: distinct =====
        System.out.println("Distinct Names:");
        namesList.stream()
                .distinct() // remove duplicates
                .forEach(name -> System.out.println(name));
        System.out.println();

        // ===== 7. Intermediate Operation: limit =====
        System.out.println("First 3 names:");
        namesList.stream()
                .limit(3) // take first 3 elements
                .forEach(name -> System.out.println(name));
        System.out.println();

        // ===== 8. Intermediate Operation: skip =====
        System.out.println("Skip first 2 names:");
        namesList.stream()
                .skip(2) // skip first 2 elements
                .forEach(name -> System.out.println(name));
        System.out.println();

        // ===== 9. Terminal Operation: count =====
        long count = namesList.stream()
                .filter(name -> name.startsWith("R"))
                .count();
        System.out.println("Number of names starting with 'R': " + count);
        System.out.println();

        // ===== 10. Terminal Operation: collect to List =====
        List<String> filteredList = namesList.stream()
                .filter(name -> !name.equals("Gita"))
                .collect(Collectors.toList());
        System.out.println("Filtered list (excluding Gita): " + filteredList);
        System.out.println();

        // ===== 11. Terminal Operation: collect to Set =====
        Set<String> uniqueNames = namesList.stream()
                .collect(Collectors.toSet());
        System.out.println("Unique names collected into Set: " + uniqueNames);
        System.out.println();

        // ===== 12. Terminal Operation: reduce =====
        String combinedNames = namesList.stream()
                .reduce("", (a, b) -> a + ", " + b); // combine names
        System.out.println("Combined Names using reduce: " + combinedNames);
        System.out.println();

        // ===== 13. Terminal Operation: toArray =====
        String[] arrayFromStream = namesList.stream()
                .toArray(String[]::new);
        System.out.println("Array from Stream: " + Arrays.toString(arrayFromStream));
        System.out.println();

        // ===== 14. Terminal Operation: collect to Map (groupingBy) =====
        Map<String, Long> nameCountMap = namesList.stream()
                .collect(Collectors.groupingBy(name -> name, Collectors.counting()));
        System.out.println("Names grouped by count (Map): " + nameCountMap);
        System.out.println();

        // ===== 15. Combined operations example =====
        System.out.println("Combined operations example:");
        List<String> combinedResult = namesList.stream()
                .filter(name -> name.length() > 3) // filter names with length > 3
                .map(name -> name.toUpperCase()) // convert to uppercase
                .sorted() // sort alphabetically
                .distinct() // remove duplicates
                .limit(3) // take first 3
                .collect(Collectors.toList()); // collect to list
        System.out.println(combinedResult);
    }
}
