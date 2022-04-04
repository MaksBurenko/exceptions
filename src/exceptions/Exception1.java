package exceptions;

public class Exception1 {

    public static void main(String[] args) {
        double x = -21.2;
        double c = sqrt(x);
        System.out.println(c);
    }

    public static double sqrt(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Expected non-negative number, got " + x);
        } else {
            double c = Math.sqrt(x);
            return c;
        }
    }
}
