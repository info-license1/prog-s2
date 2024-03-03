package tm4.ex1;

public class Main {
    public static void afficheNombresDecroissant(int n) {
        if (n == 1) {
            System.out.print(n + " ");
        } else {
            System.out.print(n + " ");
            afficheNombresDecroissant(n - 1);
        }
    }

    public static void afficheNombresCroissant(int n) {
        if (n == 1) {
            System.out.print(n + " ");
        } else {
            afficheNombresCroissant(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        afficheNombresDecroissant(5);
        System.out.println();
        afficheNombresCroissant(5);
    }
}
