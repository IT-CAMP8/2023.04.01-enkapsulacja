package pl.camp.it.enkapsulacja;

import pl.camp.it.enkapsulacja.a.Client;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        random.nextInt(101);

        Client client = new Client();
        pl.camp.it.enkapsulacja.b.Client client2 =
                new pl.camp.it.enkapsulacja.b.Client();
    }
}
