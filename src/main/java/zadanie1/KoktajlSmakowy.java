package zadanie1;


import java.util.Random;


public abstract class KoktajlSmakowy extends Koktajl implements Smakowalne{


    protected final RodzajSmaku rodzajSmaku;

    protected KoktajlSmakowy(int kcal, RodzajSmaku rodzajSmaku) {
        super(kcal);
        this.rodzajSmaku = rodzajSmaku;
    }

    @Override
    public void pij() {

    }

    @Override
    public RodzajSmaku smak() {
        return rodzajSmaku;
    }


    public ZrodloSmaku zrodloSmaku(){
        final ZrodloSmaku zrodloSmaku;
        switch (rodzajSmaku){

            case TRUSKAWKOWY:
            case BANANOWY:
            case SZPINAKOWY:
                break;
            case CIASTECZKOWY:
                break;
            case JABLKOWY:
                break;
        }
    }

    public static void main(String[] args) {
        int index = new Random().nextInt(0, ZrodloSmaku.values().length);
        ZrodloSmaku zrodloSmaku =  ZrodloSmaku.values()[index]; // RodzajTruskawki.SUPER_NEW;
        System.out.println("Wylosowano " + zrodloSmaku);
        int sizeFromStatement = switchStatement(zrodloSmaku);
        // switch expressions are recommended!!!
        int sizeFromExpression = switchExpression(zrodloSmaku);
    }
    private static int switchStatement(ZrodloSmaku zrodloSmaku) {
        System.out.println("Switch statement");
        final int size;
        switch (zrodloSmaku) {
            case OWOCOWY:
                System.out.println(zrodloSmaku);
                size = 1;
                break;
            case WARZYWNY:
                System.out.println(zrodloSmaku);
                size = 2;
                break;
            case INNY:
                System.out.println(zrodloSmaku);
                size = 3;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + zrodloSmaku);
        }
        return size;
    }

    private static int switchExpression(ZrodloSmaku zrodloSmaku) {
        System.out.println("Switch expression");
        return switch (zrodloSmaku) {
            case OWOCOWY -> {
                System.out.println(zrodloSmaku);
                yield 1;
            }
            case WARZYWNY -> {
                System.out.println(zrodloSmaku);
                yield 2;
            }
            case INNY -> {
                System.out.println(zrodloSmaku);
                yield 3;
            }

        };
    }
}
