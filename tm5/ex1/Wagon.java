public class Wagon {
    String type;
    int nombreDePlaces;
    Wagon prochain;

    public Wagon(String type, int nombreDePlaces) {
        this.nombreDePlaces = nombreDePlaces;
        this.type = type;
    }

    public static Wagon TrainCreation() {
        Wagon first = new Wagon("Loco", 2);
        Wagon w = first;
        for (int i = 0; i < 10; i++) {
            w.prochain = new Wagon("Passagers", new java.util.Random().nextInt(125));
            w = w.prochain;
        }
        return first;
    }

    public static void toString(Wagon w) {
        if (w != null) {
            System.out.println(w.type + " " + w.nombreDePlaces);
            toString(w.prochain);
        }
    }

    public static int numberOfWagons(Wagon w) {
        if (w == null) {
            return 0;
        }
        return 1 + numberOfWagons(w.prochain);
    }

    public static int numberOfSeats(Wagon w) {
        if (w == null) {
            return 0;
        }
        return w.nombreDePlaces + numberOfSeats(w.prochain);
    }

    public static void addFretWagonAtEnd(Wagon w) {
        if (w.prochain == null) {
            w.prochain = new Wagon("Fret", 0);
        } else {
            addFretWagonAtEnd(w.prochain);
        }
    }
}
