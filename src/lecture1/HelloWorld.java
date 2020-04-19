package lecture1;


import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao mot so:");
        String a = scanner.nextLine();

        a = a + 10;

        System.out.println("Ket qua: " + a);

    }
}
