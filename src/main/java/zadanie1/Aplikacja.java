package zadanie1;
import java.util.Random;
public class Aplikacja {

    public static void main(String[] args) {
        koktailTruskawkowy koktailTruskawkowy = new koktailTruskawkowy(300, RodzajTruskawki.ANANASOWA, ZrodloSmaku.OWOCOWY);
        koktailTruskawkowy.jedz();
        koktailTruskawkowy.pij();
    }

    public static int test(int myVar) {
        return myVar * 2;
    }
}