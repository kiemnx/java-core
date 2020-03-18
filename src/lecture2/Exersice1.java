package lecture2;

public class Exersice1 {




    public static void main(String[] args)
    {
        int[] a = {12,12,41,4,2,64,44,11,90,433,555555};
        int n = 11;
        int counter2=0;
        Long startTime = System.nanoTime();
        for (int i = 0; i <n ; i++) {
            double canBacHai = Math.sqrt(a[i]);
            int x = (int) canBacHai;
            if((canBacHai - x) == 0){
                counter2++;
            }
        }
        Long endTime = System.nanoTime();

        System.out.println("For runtime: " + (endTime - startTime) + "us");
    }
}