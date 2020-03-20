package lecture8.sort;

import lecture6.CanBo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserDefindSort {
    public static void main(String[] args){
        List<CanBo> canBos = new ArrayList<>();
        CanBo canBoMot = new CanBo("Mot");
        CanBo canBoHai = new CanBo("Hai");
        CanBo canBoBa = new CanBo("Ba");
        CanBo canBoBon = new CanBo("Bon");

        canBos.add(canBoMot);
        canBos.add(canBoHai);
        canBos.add(canBoBa);
        canBos.add(canBoBon);

//        Collections.sort(canBos);
    }
}
