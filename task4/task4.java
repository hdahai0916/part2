package part2.task4;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import part2.task4.Student;
public class task4 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 85),
                new Student("Bob", 58),
                new Student("Charlie", 90),
                new Student("David", 45),
                new Student("Eve", 72),
                new Student("Frank", 60),
                new Student("Grace", 55),
                new Student("Heidi", 95)
        );

        //List<String> passingStudents = students.stream()
                // 在这里补充你的流操作
               // ;

               List<String> strings = List.of("I", "am", "a", "list", "of", "Strings");
Stream<String> stream = strings.stream();
Stream<String> limit = stream.limit(4);
System.out.println("limit = " + limit);
        //System.out.println(passingStudents);
    }
}