public class Test {
    public static void main(String[] args) {
        Personne first = Personne.creationFamille(1950);

        Personne.toString(first);

        System.out.println(Personne.numberOfDescendants(first));
        System.out.println(Personne.numberOfDescendantsWithoutChildren(first));
        System.out.println(Personne.largestDistance(first));
    }
}
