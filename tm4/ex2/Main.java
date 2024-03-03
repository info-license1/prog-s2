package tm4.ex2;

public class Main {
    public static void ligne(int n) {
        if (n == 0) {
            return;
        } else {
            System.out.print("* ");
            ligne(n - 1);
        }
    }

    public static void triangle(int n) {
        if (n == 0) {
            return;
        } else {
            triangle(n - 1);
            ligne(n);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ligne(5);
        System.out.println();
        System.out.println();
        triangle(10);
    }
}
