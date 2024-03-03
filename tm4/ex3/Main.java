package tm4.ex3;

public class Main {
    public static void isInJ(int[] tab, int x, int j) {
        if (j == 0) {
            System.out.println("x is not in tab");
        } else {
            if (tab[j - 1] == x) {
                System.out.println("x is in tab");
            } else {
                isInJ(tab, x, j - 1);
            }
        }
    }

    public static void multiplyByX(int[] tab, int x, int j) {
        if (j == 0) {
            return;
        } else {
            tab[j - 1] *= x;
            multiplyByX(tab, x, j - 1);
        }
    }

    public static void sameValueTwiceAdjacent(int[] tab, int j) {
        if (j == 1) {
            System.out.println("No same value twice adjacent");
        } else {
            if (tab[j - 1] == tab[j - 2]) {
                System.out.println("Same value twice adjacent");
            } else {
                sameValueTwiceAdjacent(tab, j - 1);
            }
        }
    }
}
