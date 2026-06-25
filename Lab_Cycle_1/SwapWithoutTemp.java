public class SwapWithoutTemp {
    public static void main(String[] args) {

        int A = 15;
        int B = 25;

        System.out.println("Before Swap");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        // Swapping without temporary variable
        A = A + B;
        B = A - B;
        A = A - B;

        System.out.println("\nAfter Swap");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }
}