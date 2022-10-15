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
    public String smak() {
        String tekst = String.format("o cechach " + rodzajTruskawki.cecha() + " i słodkosci " + rodzajSmaku.slodkosc());
        return tekst;
    }

    @Override
    public void pij() {
        System.out.println("Pijalne koktajl " + smak());

        String message = String.format("Pijalny koktajl %s", smak());
        System.out.println(message);
    }
}
