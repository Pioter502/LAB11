package zadanie1;

public enum ZrodloSmaku {

    OWOCOWY("owocowy"),
    WARZYWNY("warzywny"),
    INNY("inszy"),;

    private String nazwa;


    ZrodloSmaku(final String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "ZrodloSmaku{" +
                "smak='" + nazwa + '\'' + '}';
    }
}