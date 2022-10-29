package zadanie1;

public enum RodzajSmaku {
    TRUSKAWKOWY("Truskawkowy", 4),
    BANANOWY("Bananowy", 2),
    SZPINAKOWY("Szpinakowy", 0),
    CIASTECZKOWY("Ciasteczkowy", 5),
    JABLKOWY("Jablkowy", 1),
    ;

    private final String nazwa;
    private final int poziom;

    RodzajSmaku(String nazwa, int poziom) {
        this.nazwa = nazwa;
        this.poziom = poziom;
    }

    public String nazwa() {
        return nazwa;
    }

    public int poziomSmaku() {
        return poziom;
    }

    @Override
    public String toString() {
        return "RodzajSmaku{" +
                "nazwa='" + nazwa + '\'' +
                ", poziom=" + poziom +
                '}';
    }
}