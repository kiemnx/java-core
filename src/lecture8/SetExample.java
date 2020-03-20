package lecture8;

import lecture6.CanBo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<CanBo> canBos = new HashSet<>();
        CanBo canBoMot = new CanBo("Mot");
        CanBo canBoHai = new CanBo("Hai");
        CanBo canBoBa = new CanBo("Ba");
        CanBo canBoBon = new CanBo("Bon");

        canBos.add(canBoMot);
        canBos.add(canBoHai);

        canBos.add(canBoBa);
        canBos.add(canBoBa);

        canBos.add(canBoBon);

        if(canBos.contains(canBoBa)){
            System.out.println("Ton tai can ba");
        }

        System.out.println(canBos);
    }
}
