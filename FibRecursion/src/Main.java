
public class Main {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        System.out.printf(" "+x);
        System.out.printf(" "+y);
        fibonacci(x, y);
    }

    private static int fibonacci(int x, int y) {
        int fib = x + y;
        if (fib > 100000)
            return -1;
        System.out.printf(" "+fib);
        return fibonacci(y, fib);
    }
}