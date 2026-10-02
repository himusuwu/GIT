// TODO: musimy dodac brakujace klasy!

// OK, ja dodam 'Adder', a s##### doda 'Substractor'.

public class Main {
    public static void main(String[] args) {
        Adder adder = new Adder();
        IO.println(adder.add(1, 2));

        Substractor substractor = new Substractor();

        IO.println(substractor.substract(6, 3));
    }
}
