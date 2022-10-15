package zadanie1;


public class koktailTruskawkowy extends Koktajl implements Smakowalne {

    private final RodzajTruskawki rodzajTruskawki;

    private final RodzajSmaku rodzajSmaku;

    public koktailTruskawkowy(
            final int kcal,
            final RodzajTruskawki rodzajTruskawki,
            final RodzajSmaku rodzajSmaku
            ){
        super(kcal);
        this.rodzajTruskawki = rodzajTruskawki;
        this.rodzajSmaku = rodzajSmaku;
        //RodzajTruskawki.ANANASOWA.cecha();
    }

    @Override
    public RodzajSmaku smak() {
        return rodzajSmaku;
    }

    @Override
    public void pij() {
        System.out.println("Pijalne koktajl " + smak());

        String message = String.format("o cechach " + rodzajTruskawki.cecha() + " i słodkosci " + rodzajSmaku.slodkosc() + " o smaku: " + smak());
        System.out.println(message);
    }
}
