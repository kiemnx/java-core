package lecture6;

public interface QLCBInterface {
    CanBo themMoiCanBo(String name, int age, String gender, String add);

    CanBo timKiemTheoHoTen(String name, CanBo[] cbList);

    void hienThiDanhsachCacCanBo(CanBo[] cbList);
}
