package lecture5.abstraction;

public abstract class SenderAbstract {

    abstract void printMessage();
    abstract Message getSenderMessage();


    int a = 10;

    void print(){
        System.out.println("Hello World");
    }
}
