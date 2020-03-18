package lecture7;

public class NullPointException {

    public static void main(String[] args){
        NullPointException object = new NullPointException();

        object.print();
    }

    public void print(){
        System.out.println("Test null");
    }
}
