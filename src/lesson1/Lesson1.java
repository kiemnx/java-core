package lesson1;


import java.util.Scanner;

public class Lesson1 {

    private int instanceVariable = 30;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen a:");
        int a = scanner.nextInt();
        System.out.println("So ban vua nhap la: " + a);

        int b = a + 10;
        System.out.println("So ban vua nhap cong them 10 la: " + b);

    }

    private int sum(int a, int b){
        int sum = a + b;
        sum = sum + instanceVariable;
        return sum;
    }
}
