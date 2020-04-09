package lecture10;

public class RegexExample {
    public static void main(String[] args){

        String test = "     Nguyen Van      387    A";
        test = test.replaceAll("\\d", "");
        System.out.println(test);
        test = test.replaceAll("\\s+", " ");
        System.out.println(test);
        test = test.replaceAll("^\\s+", "");
        System.out.println(test);

        String data = "kiemnguyenxuan@gmail.com\n" +
                "kiemnguyenxuan@@gmail.com\n" +
                "kiemnx@yopmail.com\n" +
                "kiemnx@$.com\n" +
                "abc123@gmail.com\n" +
                "kiem@nx@gmail.com\n" +
                "kiem.nx@gmail.com\n" +
                "as%&*as*@gmail.com\n" +
                "kiem.nx.92@gmail.com";

        String[] gmails = data.split("\n");

        for(String gmail : gmails){
            boolean result = gmail.matches("^[\\w\\.-]+@gmail\\.com$");
            if(result == true){
                System.out.println(gmail +": OK");
            } else {
                System.out.println(gmail + ": Invalid");
            }
        }

    }
}
