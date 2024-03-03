package tm4.ex4;

public class Main {
    public static boolean palyndrome(String mot) {
        if (mot.length() <= 1) {
            return true;
        } else {
            if (mot.charAt(0) == mot.charAt(mot.length() - 1)) {
                return palyndrome(mot.substring(1, mot.length() - 1));
            } else {
                return false;
            }
        }
    }

    public static String verlan(String mot) {
        if (mot.length() <= 1) {
            return mot;
        } else {
            return mot.charAt(mot.length() - 1) + verlan(mot.substring(0, mot.length() - 1));
        }
    }

    public static void main(String[] args) {
        System.out.println(palyndrome("kayak"));
        System.out.println(palyndrome("kayyak"));
        System.out.println(palyndrome("kayak "));
        System.out.println(verlan("renaissance"));
    }
}
