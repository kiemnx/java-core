package lecture7;

import java.text.NumberFormat;

public class TryCatchHandling {
    public static void main(String[] args) {

        int a = 2;
        int b = 5;
        int c = b / a;

        try {
//            System.out.println(Integer.parseInt("1ba"));
            int[] array = new int[2];
            System.out.println(array[2]);

        } catch (NumberFormatException e){

            System.out.println("Ép kiểu không hợp lệ");

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Truy cập chỉ số mảng không đúng");

        } catch (Exception e){

            System.out.println("Có lỗi xảy ra");

        }
        System.out.println("Finish test");

    }

}


