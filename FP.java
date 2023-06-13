import java.util.List;

public class FP {
    public static void main(String[] args) {
        printAllNumbersInListStructure(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
        printAllNumbersInListFuntional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
    }

    private static void print(int number) {
        System.out.println(number);
    }

    private static void printAllNumbersInListFuntional(List<Integer> numbers) {

        numbers.stream()
                .forEach(FP::print); // Method reference
    }

    private static void printAllNumbersInListStructure(List<Integer> numbers) {
        // How to loop the numbers?
        // How to print?
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
