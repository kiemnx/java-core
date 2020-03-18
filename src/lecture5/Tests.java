package lecture5;


import java.util.Random;
import java.util.Scanner;

public class Tests {
    public static void main(String[] args) {
        System.out.print("Choose the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100 - (-100) +1) -100;
            System.out.print(arr[i] + ", ");
        }
        int sum = 0;
        int num = 0;
        for (int j = 0; j < n; j++)
            if (j % 2 != 0 && arr[j] % 2 != 0) { // so le o vi tri chan //
                sum = sum + arr[j];
                num++;
            }
        double mean = (double) sum / num;
        System.out.println();
        System.out.println("The mean of the odd numbers in the even positions is: " + mean);
        
    }
}
