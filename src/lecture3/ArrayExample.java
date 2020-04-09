package lecture3;


public class ArrayExample {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int a = 10;

        String[] hexa ={};

      /*  //Tham tri
        System.out.println("1. Before: " + a);
        thamTri(a);
        System.out.println("1. After: " + a);
*/
        //Tham chieu
        System.out.println("2. Before: " + array[0]);
        thamChieu(array);
        System.out.println("2. After: " + array[0]);
        printFirstElement(array);

    }

   /* private static void thamTri(int a){
        a = 111;
    }*/
    private static void thamChieu(int[] array){
        int[] copyArray = new int[array.length];
        copyArray[0] = 111;
    }

    private static void printFirstElement(int[] array){
        if(array[0] == 1){
            System.out.println("Phan tu dau tien la 0");
        }
    }
}
