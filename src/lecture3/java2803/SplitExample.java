package lecture3.java2803;

import java.util.Scanner;

public class SplitExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một trạng thái : ");
        String str = sc.nextLine();

        //nguyen xuan kiem nguyen van nghiem
        String[] word = str.split(" ");

        int max = 0;

        for (int i = 0;i< word.length; i++){
            if(word[i].length() > max){
                max = word[i].length();
            }
        }

        for(int i =0; i<word.length; i++){
            if(word[i].length() == max){
                System.out.print(word[i] + ",");
            }
        }
    }
}
