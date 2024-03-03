public class Noeud {
    int valeur;
    Noeud droit;
    Noeud gauche;

    public static Noeud creation(int valeur, int prof) {
        Noeud n = new Noeud();
        n.valeur = valeur;
        if (10.0 * Math.random() > prof) {
            n.gauche = creation((int) (Math.random() * 500.0), prof + 1);
        }
        if (10.0 * Math.random() > prof) {
            n.droit = creation((int) (Math.random() * 500.0), prof + 1);
        }
        return n;
    }

    public int sum() {
        int s = valeur;

        if (gauche != null) {
            s += gauche.sum();
        }

        if (droit != null) {
            s += droit.sum();
        }

        return s;
    }

    public boolean hasValue(int value) {
        if (valeur == value) {
            return true;
        }

        if (gauche != null && gauche.hasValue(value)) {
            return true;
        }

        if (droit != null && droit.hasValue(value)) {
            return true;
        }

        return false;
    }
}
