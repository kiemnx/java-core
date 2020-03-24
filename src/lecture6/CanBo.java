package lecture6;

public class CanBo {
    private String hoTen;
    private int tuoi;
    private String gioiTinh;
    private String diaChi;


    public CanBo(){
    }

    public CanBo(String hoTen) {
        this.hoTen = hoTen;
    }


    public CanBo(String hoTen, int age) {
        this.hoTen = hoTen;
        this.tuoi = age;
    }

    public String getHoTen() {

        return hoTen;
    }

    public void setHoTen(String hoTen) {

        this.hoTen = hoTen;
    }

    public int getTuoi() {

        return tuoi;
    }

    public void setTuoi(int tuoi) {

        this.tuoi = tuoi;
    }

    public String getGioiTinh() {

        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {

        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {

        return diaChi;
    }

    public void setDiaChi(String diaChi) {

        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }
}
