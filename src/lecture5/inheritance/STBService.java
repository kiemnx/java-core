package lecture5.inheritance;

public class STBService implements BankInterface {


    @Override
    public Integer getLaiSuatTheoKyHan(Integer soThang) {
        if(soThang > 12)
            return 9;
        else
            return 7;
    }
}
