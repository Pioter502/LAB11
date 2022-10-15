package zadanie1;

public enum RodzajSmaku {

    TRUSKAWKOWY(10),
    BANANOWY(5),
    SZPINAKOWY(0),
    CIASTECZKOWY(99),
    JABLKOWY(7);


    private final int slodkosc;

    RodzajSmaku(final int slodkosc) {
        this.slodkosc = slodkosc;
    }

    public int slodkosc(){
        return slodkosc;
    }
}
