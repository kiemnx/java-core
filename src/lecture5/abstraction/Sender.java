package lecture5.abstraction;

public class Sender extends SenderAbstract{

    int a = 10;


    @Override
    void printMessage() {

    }

    @Override
    Message getSenderMessage() {
        return null;
    }
}
