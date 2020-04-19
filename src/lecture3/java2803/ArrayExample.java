package lecture3.java2803;

import java.util.Scanner;

public class ArrayExample {

    public static void main(String[] args) {
        System.out.println("Nhap vao mang: ");
        Scanner sc = new Scanner(System.in);

        //49, 1, 2, 200, 2, 3, 4, 5, 8, 9, 10

        String input = sc.nextLine();
        String[] numbers = input.split(", ");
        int n = numbers.length;

        int[] a = new int[n];

        for(int i = 0; i< n; i++){
            a[i] = Integer.valueOf(numbers[i]);
        }

        int max = 0;
        int dem = 1;

        for(int i=0; i<n-1; i++){
            if(a[i+1] - a[i] == 1){
                dem++;
                if(dem > max)
                    max = dem;
            } else
                dem = 1;
        }
        System.out.println("max length = " + max);
    }
}
