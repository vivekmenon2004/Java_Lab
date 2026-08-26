class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {

    public static void withdraw(double balance, double amount)
            throws InsufficientFundsException {

        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive.");
        }

        if (amount > balance) {
            throw new InsufficientFundsException(
                    "Insufficient balance! Required: " + amount
            );
        }

        System.out.println("Withdrawal successful. New balance: "
                + (balance - amount));
    }

    public static void setAge(int age) {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException(
                    "Age must be between 0 and 150."
            );
        }

        System.out.println("Age set to " + age);
    }

    public static void main(String[] args) {
        try {
            withdraw(100.0, 200.0);
        } catch (InsufficientFundsException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }

        try {
            setAge(200);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}