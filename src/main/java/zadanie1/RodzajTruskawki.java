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

    ANANASOWA("Białe owoce"),
    HONEOYE("Wyrazista"),
    POLKA("Najsmaczniejsza"),
    KENT("Dla fanów słodyczy"),
    CHRISTIN("Zaowocuje szybko i obficie");

    private final String cecha;

    RodzajTruskawki(final String cecha){
        this.cecha = cecha;
    }

    public String cecha(){
        return cecha;
    }

}
