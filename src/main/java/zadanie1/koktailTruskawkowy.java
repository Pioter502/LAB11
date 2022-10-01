package zadanie1;

public class koktailTruskawkowy extends Koktajl implements Smakowalne {




    @Override
    public void smak() {
        System.out.println("Smak truskawkowy");
    }

    @Override
    public void pij() {
        System.out.println("Pijalne");
    }
}
