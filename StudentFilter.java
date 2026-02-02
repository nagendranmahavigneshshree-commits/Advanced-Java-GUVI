import java.util.Arrays;
import java.util.List;

public class StudentFilter {
    public static void main(String[] args) {

        List<String> students = Arrays.asList(
            "Arun", "Ajay", "Ravi", "Anita", "Kumar",
            "Asha", "Vijay", "Amit", "Suresh", "Anand"
        );

        System.out.println("Students who get special gifts:");

        students.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
    }
}
