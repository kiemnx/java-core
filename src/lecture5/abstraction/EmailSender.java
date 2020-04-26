package lecture5.abstraction;

public class EmailSender implements SenderInterface {
    @Override
    public void sendMessage(String title, String content, String receiver, String sender) {

    }

    @Override
    public Message receiverMessga(String from, String content, String title) {
        return null;
    }

    @Override
    public void print() {

    }

    void printHello(){
        System.out.println("HelloWorld");
    }
}
