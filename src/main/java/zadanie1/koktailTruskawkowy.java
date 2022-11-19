package zadanie1;
public class koktailTruskawkowy extends KoktajlSmakowy {
    private final RodzajTruskawki rodzajTruskawki;

    public koktailTruskawkowy(
            final int kcal,
            final RodzajTruskawki rodzajTruskawki) {
        super(kcal, RodzajSmaku.TRUSKAWKOWY);
        this.rodzajTruskawki = rodzajTruskawki;
    }

    @Override
    public void pij() {
        // Zadanie:
        // Przy użyciu switch statement oraz switch expression (jedna metoda zakomentowana)
        // do sformatowanej wiadomości dodaj
        // na podstawie rodzaju smaku informację o tym czy smak jest: OWOCOWY, WARZYWNY czy INNY
        // informacja ta powinna pochodzić z nowej metody zrodloSmaku,
        // która zwraca nowy enum ZrodloSmaku. Metoda ta powinna zostać umieszczona w klasie KoktajlSmakowy
        System.out.println("Pije koktajl o smaku " +
                smak() + ", która cechuje się " + rodzajTruskawki.cecha()
        );
        String message = String.format(
                "Pije koktajl %s, %s, %s",
                rodzajSmaku,
                rodzajTruskawki,
                zrodloSmaku()


        );
        System.out.println(message);
    }


}