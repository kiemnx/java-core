package lecture10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPatternExample {
    public static void main(String[] args){

        String test = "So 972 dien thoai csak ^&* ua toi la 0979155813";

        Pattern pattern = Pattern.compile(".*(0[0-9]{9}).*");

        Matcher matcher = pattern.matcher(test);

        /*boolean result = matcher.matches();
        System.out.println(result);*/
        String phone = "";
        if(matcher.find()){
            phone = matcher.group(1);
        }
        System.out.println(phone);
    }
}
