public class ThrowThrowsExample {

    public static void sleepForAWhile(int ms) throws InterruptedException {
        Thread.sleep(ms);
    }

    public static void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative!");
        }
        System.out.println("Age is valid: " + age);
    }

    public static void main(String[] args) {
        try {
            sleepForAWhile(1000);
        } catch (InterruptedException e) {
            System.out.println("Sleep interrupted");
        }

        try {
            validateAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}