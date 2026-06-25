public class OperatorPrecedence {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c = 2;
        int d = 8;
        int e = 4;

        int result = a + b * c - d / e;

        System.out.println("Result = " + result);
    }
}