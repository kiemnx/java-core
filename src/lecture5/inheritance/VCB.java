package lecture5.inheritance;

public class VCB extends Bank{
    private Integer phanTramVonNhaNuoc;

    @Override
    public Integer getLaiSuat() {
        return 8;
    }

    public Integer getPhanTramVonNhaNuoc() {
        return phanTramVonNhaNuoc;
    }

    public void setPhanTramVonNhaNuoc(Integer phanTramVonNhaNuoc) {
        this.phanTramVonNhaNuoc = phanTramVonNhaNuoc;
    }
}
