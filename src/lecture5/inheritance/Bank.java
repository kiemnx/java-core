package lecture5.inheritance;

public class Bank {
    private String name;
    private String logo;
    private String soVon;
    private Integer laiSuat = 10;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getSoVon() {
        return soVon;
    }

    public void setSoVon(String soVon) {
        this.soVon = soVon;
    }

    public Integer getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(Integer laiSuat) {
        this.laiSuat = laiSuat;
    }

    void printHello(){
        System.out.println("Hello World");
    }

}
