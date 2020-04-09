package lecture2;

import java.util.ArrayList;
import java.util.List;

public class TypeCasting {

    public static final int a = 120;
    static int b = 100;

    public List<String> list = new ArrayList<>();

    public static void main(String[] args){
        double d = 100.04;
        TypeCasting main = new TypeCasting();
        main.changeStatic();
        System.out.println(b);
    }


    private void changeStatic(){
        b = 150;
    }

}
