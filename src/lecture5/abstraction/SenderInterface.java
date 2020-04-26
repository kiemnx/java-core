package lecture5.abstraction;

public interface SenderInterface extends ReceiverInterface, BaseInterface {

    void sendMessage(String title, String content, String receiver, String sender);
    Message receiverMessga(String from, String content, String title);
    void print();


}
