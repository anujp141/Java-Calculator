public class Calculator {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) num1 / num2;
    }

    public int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        int sum = calculator.add(5, 3);
        System.out.println("Sum: " + sum);

        int difference = calculator.subtract(10, 4);
        System.out.println("Difference: " + difference);

        int product = calculator.multiply(6, 7);
        System.out.println("Product: " + product);

        double quotient = calculator.divide(15, 3);
        System.out.println("Quotient: " + quotient);

        int squared = calculator.square(9);
        System.out.println("Squared: " + squared);
    }
}
