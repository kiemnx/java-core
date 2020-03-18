package lecture7;

public class UncheckedException {

    public static void main(String[] args) {
        String input = "12,13,a12,18";
        String[] items = input.split(",");

        for(String item : items){
            int a = Integer.valueOf(item);
            System.out.println(a);
        }
        System.out.println("Finish without no exception");
    }
}


