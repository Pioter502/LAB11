package zadanie1;


import java.util.Random;


public abstract class KoktajlSmakowy extends Koktajl implements Smakowalne{


    protected final RodzajSmaku rodzajSmaku;

    protected KoktajlSmakowy(int kcal, RodzajSmaku rodzajSmaku) {
        super(kcal);
        this.rodzajSmaku = rodzajSmaku;
    }


    @Override
    public RodzajSmaku smak() {
        return rodzajSmaku;
    }


//    public ZrodloSmaku zrodloSmaku() {
//        switch (rodzajSmaku) {
//            case TRUSKAWKOWY:
//            case BANANOWY:
//            case JABLKOWY:
//                return ZrodloSmaku.OWOCOWY;
//            case SZPINAKOWY:
//                return ZrodloSmaku.WARZYWNY;
//            case CIASTECZKOWY:
//                return ZrodloSmaku.INNY;
//            default:
//                throw new IllegalStateException("Unexpected value: " + rodzajSmaku);
//        }
//    }

    public ZrodloSmaku zrodloSmaku() {
        return switch (rodzajSmaku) {
            case TRUSKAWKOWY, JABLKOWY, BANANOWY -> ZrodloSmaku.OWOCOWY;
            case SZPINAKOWY -> ZrodloSmaku.WARZYWNY;
            case CIASTECZKOWY -> ZrodloSmaku.INNY;
        };
    }
}