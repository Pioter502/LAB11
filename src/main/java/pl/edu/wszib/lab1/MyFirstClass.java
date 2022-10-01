package pl.edu.wszib.lab1;

public class MyFirstClass implements  MyFirstInterface{


    public static String myStaticField;
    private String firstField;

    String firstField2;

    // modyfikatory dostępu:
    // private
    // nic nie wpisane - default - dostep na poziomie pakietu
    // protected - dostep w klasach dziedziczących plus w obrębie pakietu
    // public

    @Override
    public void run1(){
        System.out.println("First Field = " + firstField);
        System.out.println("First Field2 = " + firstField2);
    }

    @Override
    public void run2() {

    }


}
