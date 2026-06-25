public class SwapUsingTemp {
    public static void main(String[] args) {

        int A = 15;
        int B = 25;

        System.out.println("Before Swap");
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        // Swapping using temporary variable
        int temp = A;
        A = B;
        B = temp;

        System.out.println("\nAfter Swap");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
    }
}