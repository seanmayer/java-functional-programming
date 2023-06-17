import java.util.List;

public class FP {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        printAllNumbersInListStructure(numbers);
        printAllNumbersInListFuntional(numbers);
        printAllNumbersInListFuntional1(numbers);
        printEvenNumbersInListStructure(numbers);
        printEvenNumbersInListFunctional(numbers);
    }

    private static void printAllNumbersInListStructure(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    private static void printAllNumbersInListFuntional(List<Integer> numbers) {
        numbers.stream()
                .forEach(FP::print); // Method reference
    }

    private static void print(int number) {
        System.out.println(number);
    }

    private static void printAllNumbersInListFuntional1(List<Integer> numbers) {
        numbers.stream()
                .forEach(System.out::println); // Method reference
    }

    //Print only even numbers
    private static void printEvenNumbersInListStructure(List<Integer> numbers) {
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(FP::isEven) // Method reference
                .forEach(System.out::println); // Method reference
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

}
