package pl.edu.wszib.lab1.myabstract;

public abstract class MyAbstractClass {

    protected String myProtectedField;

    protected String myProtectedField2;

    protected void myProceted(){
        System.out.println("myProtectedField = " + myProtectedField);
    }

    protected abstract void myAbstract();

}
