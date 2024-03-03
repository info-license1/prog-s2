public class Personne {
    String nom;
    int anneeDeNaissance;
    Personne[] enfants;

    public Personne(String nom, int anneeDeNaissance) {
        this.nom = nom;
        this.anneeDeNaissance = anneeDeNaissance;
    }

    public static Personne creationFamille(int annee) {
        Personne personne = new Personne("Personne: " + annee, annee);

        if (annee < 2000) {
            int numberOfChildren = (int) (Math.random() * 4);
            personne.enfants = new Personne[numberOfChildren];

            for (int i = 0; i < numberOfChildren; i++) {
                int year = (int) (Math.random() * 20) + 20;
                personne.enfants[i] = creationFamille(annee + year);
            }
        } else {
            personne.enfants = new Personne[0];
        }

        return personne;
    }

    public static void toString(Personne p) {
        // Nicely print the family tree like a tree
        int depth = largestDistance(p) + 1;

        for (int i = 0; i < depth; i++) {
            printLevel(p, i);
            System.out.println();
        }

        System.out.println();
    }

    private static void printLevel(Personne p, int level) {
        if (level == 0) {
            System.out.print(p.nom + " ");
        } else {
            for (Personne enfant : p.enfants) {
                printLevel(enfant, level - 1);
            }
        }
    }

    public static int numberOfDescendants(Personne p) {
        if (p == null) {
            return 0;
        }

        int count = 0;
        for (Personne enfant : p.enfants) {
            count += 1 + numberOfDescendants(enfant);
        }

        return count;
    }

    public static int numberOfDescendantsWithoutChildren(Personne p) {
        if (p == null) {
            return 0;
        }

        int count = 0;
        for (Personne enfant : p.enfants) {
            count += numberOfDescendantsWithoutChildren(enfant);
        }

        return count;
    }

    public static int largestDistance(Personne p) {
        if (p == null) {
            return 0;
        }

        int max = 0;
        for (Personne enfant : p.enfants) {
            max = Math.max(max, 1 + largestDistance(enfant));
        }

        return max;
    }
}
