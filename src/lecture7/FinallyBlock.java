package lecture7;

public class FinallyBlock {
    public static void main(String[] args) {
        System.out.println("Before call phepChia func.");

        int ret = phepChia(23, 12);
        System.out.println("Result = " + ret);

        System.out.println("After call phepChia func.");
    }

    private static int phepChia(int a, int b) {
        System.out.println("phepChia func is being run!");
        try {

            int c = a / b;
            return c;

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e);
            return -999999;
        } finally {
            System.out.println("Finally block");
        }
    }

}
