package lecture4;

public class Student {
    // ten, tuoi, mssv, gioi_tinh
    private String ten;
    private int tuoi;
    private String mssv;
    private String gioiTinh;

    public Student() {
    }

    public Student(String name, int tuoi){
        this.ten = name;
        this.tuoi = tuoi;
    }

    public Student(String ten, int tuoi, String gioiTinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    public void tangTuoi(int soTuoi){
        tuoi = tuoi + soTuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
}
