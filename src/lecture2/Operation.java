package lecture2;

import java.util.Scanner;

public class Operation {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so a: ");
        int a = scanner.nextInt();

        System.out.println("Nhap vao so so hang n: ");
        int n = scanner.nextInt();

        long sum = 0;
        String numString = "";

        String printStr = "";
        for(int i = 1; i <= n; i ++){
            numString = numString + a;
            if(i == n){
                printStr = printStr + numString;
            } else {
                printStr = printStr + numString + " + ";
            }
            long curNumber = Long.valueOf(numString);
            sum = sum + curNumber;
        }

        System.out.println(printStr);
        System.out.println(sum);
    }
}
