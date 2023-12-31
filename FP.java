import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class FP {

    /**
     * Main method
     * @param args
     */
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        printAllNumbersInListStructure(numbers);
        printAllNumbersInListFuntional(numbers);
        printAllNumbersInListFuntional1(numbers);
        printEvenNumbersInListStructure(numbers);
        printEvenNumbersInListFunctional(numbers);
        printEvenNumberInListLambda(numbers);
        printOddNumbersInListFunctional(numbers);
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        courses.stream()
                .forEach(System.out::println);

        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);

        courses.stream()
                .filter(course -> course.length() >= 4)
                .forEach(System.out::println);

        List<String> fruits = List.of("Apple", "Orange", "Banana", "Pineapple", "Mango", "Grape");
        Predicate<? super String> predicate = fruit -> fruit.startsWith("A");
        Optional<String> optional = fruits.stream().filter(predicate).findFirst();
        System.out.println(optional);
        System.out.println(optional.isEmpty());
        System.out.println(optional.isPresent());
        System.out.println(optional.get());

        Optional<String> fruit = Optional.of("Apple");
        System.out.println(fruit);
        Optional<String> empty = Optional.empty();
        System.out.println(empty);

    }

    /**
     * Print all numbers in list structure
     * @param numbers
     */
    private static void printAllNumbersInListStructure(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    /**
     * Print all numbers in list functional
     * @param numbers
     */
    private static void printAllNumbersInListFuntional(List<Integer> numbers) {
        numbers.stream()
                .forEach(FP::print); // Method reference
    }

    /**
     * Print a number
     * @param number
     */
    private static void print(int number) {
        System.out.println(number);
    }

    /**
     * Print all numbers in list functional
     * @param numbers
     */
    private static void printAllNumbersInListFuntional1(List<Integer> numbers) {
        numbers.stream()
                .forEach(System.out::println); // Method reference
    }

    /**
     * Print even numbers in list structure
     * @param numbers
     */
    private static void printEvenNumbersInListStructure(List<Integer> numbers) {
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

    /**
     * Print even numbers in list functional
     * @param numbers
     */ 
    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(FP::isEven) // Method reference
                .forEach(System.out::println); // Method reference
    }

    /**
     * Check if a number is even
     * @param number
     * @return
     */
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    /**
     * Print even numbers in list functional lambda expression
     * @param numbers
     */
    private static void printEvenNumberInListLambda(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }

    /**
     * Print odd numbers in list functional
     * @param numbers
     */
    private static void printOddNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .forEach(System.out::println);
    }

}
