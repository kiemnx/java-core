package lecture5.inheritance;

public class VCBService implements BankInterface{


    @Override
    public Integer getLaiSuatTheoKyHan(Integer soThang) {
        if(soThang > 10)
            return 8;
        else
            return 10;
    }
}