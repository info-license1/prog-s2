public class Test {
    public static void main(String[] args) {
        Wagon first = Wagon.TrainCreation();

        Wagon.toString(first);
        System.out.println(Wagon.numberOfWagons(first));
        System.out.println(Wagon.numberOfSeats(first));
        Wagon.addFretWagonAtEnd(first);
        Wagon.toString(first);
    }
}