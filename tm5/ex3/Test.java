public class Test {
    public static void main(String[] args) {
        Noeud racine = Noeud.creation(10, 5);

        System.out.println(racine.sum());
        System.out.println(racine.hasValue(12));
    }
}