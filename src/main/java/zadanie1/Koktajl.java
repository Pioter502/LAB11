package zadanie1;

public abstract class Koktajl implements Jadalne, Pijalne{


    protected final int kcal;

    protected Koktajl(int kcal){
        this.kcal = kcal;
    }


    //final mówi że wartość tej zmiennej może być ustalona raz i do końca życia się nie zmieni

    @Override
    public void jedz() {
        pij();
    }
}
