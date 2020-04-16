package CleanCodeRename;

public class Calculator {
    public static final char ADDTION = '+';
    public static final char SUBTRATION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION ='/';
    public static int calculate(int firstNumber, int secondNumber, char operator) {
        switch (operator) {
            case ADDTION:
                return firstNumber + secondNumber;
            case SUBTRATION:
                return firstNumber - secondNumber;
            case MULTIPLICATION:
                return firstNumber * secondNumber;
            case DIVISION:
                if (secondNumber != 0)
                    return firstNumber / secondNumber;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}