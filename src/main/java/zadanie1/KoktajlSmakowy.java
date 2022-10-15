package zadanie1;



public class KoktajlSmakowy extends Koktajl implements Smakowalne{


    private final RodzajSmaku rodzajSmaku;

    public KoktajlSmakowy(int kcal, RodzajSmaku rodzajSmaku) {
        super();
        this.rodzajSmaku = rodzajSmaku;
    }

    @Override
    public void pij() {

    }

    @Override
    public RodzajSmaku smak() {
        return rodzajSmaku;
    }
}
