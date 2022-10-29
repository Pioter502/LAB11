package zadanie1;

public enum ZrodloSmaku {

    OWOCOWY("owocowy"),
    WARZYWNY("warzywny"),
    INNY("inszy");

    private final String nazwa;


    ZrodloSmaku(final String nazwa) {
        this.nazwa = nazwa;
    }

    public String nazwa() {
        return nazwa;
    }

    @Override
    public String toString() {
        return "ZrodloSmaku{" +
                "smak='" + nazwa;
    }
}