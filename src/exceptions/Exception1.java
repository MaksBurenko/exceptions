package exceptions;

public class Exception1 {

    public static void main(String[] args) {

    }
    public static double sqrt(double x) {
        if (x<0) {
            System.out.print("Expected non-negative number, got " + x);
        }else {
            double c = Math.sqrt (x);
            return c;
        }
      return;
    }
}

/*
public static void main(String[] args) {
		try {
			System.out.println(divide(20, 5));
			System.out.println(divide(20, 0));
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
	}

	public static double divide(int x, int y) {
		return x / y;
	}
 */