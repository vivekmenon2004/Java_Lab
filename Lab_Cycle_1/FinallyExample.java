public class FinallyExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index error: " + e.getMessage());
        } finally {
            System.out.println("This always runs - clean up resources.");
        }
    }
}