package zadanie1;


public class koktailTruskawkowy extends KoktajlSmakowy{

    private final RodzajTruskawki rodzajTruskawki;



    public koktailTruskawkowy(
            final int kcal,
            final RodzajTruskawki rodzajTruskawki,
            final RodzajSmaku rodzajSmaku
            ){
        super(kcal, rodzajSmaku);
        this.rodzajTruskawki = rodzajTruskawki;

        //RodzajTruskawki.ANANASOWA.cecha();
    }



    @Override
    public void pij() {
        System.out.println("Pijalne koktajl " + smak());

        String message = String.format("o cechach " + rodzajTruskawki.cecha() + " i słodkosci " + rodzajSmaku.slodkosc() + " o smaku: " + smak());
        System.out.println(message);
    }
}
