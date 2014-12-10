package StringCalculator;

public class Calculator {

    private int result = 0;

    public int getResult() {
        return result;
    }

    public void set(int x) {
        result = x;
    }

    public void add(int x) {
        result += x;
    }

    public void substract(int x) {
        result -= x;
    }
}
