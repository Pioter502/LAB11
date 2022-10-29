package zadanie1;
/**
Rodzaje truskawek:
Anananasowe
Honeoye
Polka
Kent
Christin
 */
public enum RodzajTruskawki {
    ANANASOWA("Ananasowa", "Białe owoce"),
    HONEOYE("Honeoye", "Wyrazista"),
    POLKA("Polka", "Najsmaczniejsza"),
    KENT("Kent", "Dla fanów słodyczy"),
    CHRISTINE("Christine", "Zaowocuje szybko i obficie"),
    BRAND_NEW("Brand new", "Zawiera wszystkie potrzebne witaminy i minerały"),
    SUPER_NEW("x", "d")
    ;

    private final String nazwa;
    private final String cecha;

    RodzajTruskawki(final String nazwa,
                    final String cecha) {
        this.nazwa = nazwa;
        this.cecha = cecha;
    }

    public String nazwa() {
        return nazwa;
    }

    public String cecha() {
        return cecha;
    }

    @Override
    public String toString() {
        return "RodzajTruskawki{" +
                "nazwa='" + nazwa + '\'' +
                ", cecha='" + cecha + '\'' +
                '}';
    }
}