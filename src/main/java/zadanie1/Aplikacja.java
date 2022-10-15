package zadanie1;

public class Aplikacja {

    public static void main(String[] args) {
        koktailTruskawkowy koktailTruskawkowy = new koktailTruskawkowy(100, RodzajTruskawki.ANANASOWA, RodzajSmaku.TRUSKAWKOWY);
        koktailTruskawkowy.pij();
        koktailTruskawkowy.smak();

        int myVar = 5;
        test(myVar);
        System.out.println(myVar);
    }


    public static void test(int myVar){
        myVar = 10;
    }
}
