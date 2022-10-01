package pl.edu.wszib.lab1.mypackage;

import pl.edu.wszib.lab1.myabstract.MyAbstractClass;

public class MySecondClass extends MyAbstractClass {

    private String firstField;

    String firstField2;

    // modyfikatory dostępu:
    // private
    // nic nie wpisane - default - dostep na poziomie pakietu
    // protected - dostep w klasach dziedziczących plus w obrębie pakietu
    // public

    public void run(){
        System.out.println("First Field = " + firstField);
        System.out.println("First Field2 = " + firstField2);
        myProtectedField = "my protected field";
        myProceted();
    }

    @Override
    protected void myAbstract() {

    }
}
