package tdd;

public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(String string) {
        int sum = 0;
        for (char c : string.toCharArray()) {
            if (!String.valueOf(c).equals(",")) {
                sum += Integer.parseInt(String.valueOf(c));
            }
        }
        return sum;
    }

    public static int add(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
