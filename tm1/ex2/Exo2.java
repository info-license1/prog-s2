class Exo2 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static String remplaceLettre(String s) {
        return s.replace('e', 'a');
    }

    public static String remplaceLettre(String s, char a) {
        return s.replace(a, 'a');
    }

    public static String[] decomposePhrase(String s) {
        return s.split(" ");
    }

    public static String remplaceMot(String s, String mot1, String mot2) {
        return s.replace(mot1, mot2);
    }

    public static String inversePhrase(String s) {
        String[] mots = decomposePhrase(s);
        String res = "";
        for (int i = mots.length - 1; i >= 0; i--) {
            res += mots[i] + " ";
        }
        return res;
    }
}
