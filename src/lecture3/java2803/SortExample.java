package lecture3.java2803;


public class SortExample {
    public static void main(String[] args){
        int[] array1 = {1,2,3,4,10,33};
        int[] array2 = {2,5,7,8};

        //             {1,2,3,4,*,*,*,*}
        int[] merge = new int[array1.length + array2.length];

        // add array1 to merge
        for(int i=0; i<array1.length; i++){
            merge[i]=array1[i];
        }

        // add array2 to merge
        for(int j = array1.length; j<merge.length; j++){
            merge[j] = array2[j-array1.length];
        }


        //1 2 2 3 4 33 10 5 7 8
        //1 2 2 3 4 33 10 5 7 8

        int temp = merge[0];
        for(int i=0; i< merge.length; i++) {
            for (int j = i+1; j < merge.length; j++) {

                if (merge[i] > merge[j]) {
                    temp = merge[i];
                    merge[i] = merge[j];
                    merge[j] = temp;
                }
            }
        }


        for(int value : merge){
            System.out.print(value + " ");
        }
    }
}
