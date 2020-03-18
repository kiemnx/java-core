package lecture7;

public class ThrowException {
    public static void main(String[] args) {
        System.out.println("Before call phepChia func.");

            int ret = phepChia(23, 0);
            System.out.println("Result = " + ret);


        System.out.println("After call phepChia func.");
    }


    private static int phepChia(int a, int b) {

        System.out.println("phepChia func is being run!");
        int[]array = new int[2];
        System.out.println(array[2]);
        try{
            int c = a / b;
            return c;
        } catch (Exception e){
            throw new RuntimeException("Số chia phải khác 0");
        }
    }
}
