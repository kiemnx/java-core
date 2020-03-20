package lecture8;

import lecture6.CanBo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

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

        for(int i=0; i < canBos.size(); i ++){
            System.out.println(canBos.get(i).toString());
        }
    }
}
