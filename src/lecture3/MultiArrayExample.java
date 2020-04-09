package lecture3;

public class MultiArrayExample {

    public static void main(String[] args){
        // A(1,2) B(3,3) C(5,4)

        int[] Ox = {1, 3, 5};
        int[] Oy = {2, 3, 4};

        point[] diem = new point[3];

        int[][] Oxy = new int[3][2];

        Oxy = new int[][]{{1, 2}, {3, 3}, {5, 4}};

        /*
        * 1 3 5
        * 2 3 4
        * */
        for(int i=0; i <3; i++){
            for(int j=0; j<2; j++){
                System.out.print(Oxy[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class point{
    public int x;
    public int y;
}
