package lecture8.sort;

import lecture6.CanBo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UserDefindSort {
    public static void main(String[] args){
        List<CanBo> canBos = new ArrayList<>();
        CanBo canBoMot = new CanBo("Mot", 12);
        CanBo canBoHai = new CanBo("Hai", 53);
        CanBo canBoBa = new CanBo("Ba", 34);
        CanBo canBoBon = new CanBo("Ba", 14);

        canBos.add(canBoMot);
        canBos.add(canBoHai);
        canBos.add(canBoBa);
        canBos.add(canBoBon);
        List<String> nameList = new ArrayList<>();
        for(CanBo cb : canBos){
            nameList.add(cb.getHoTen());
        }


        Collections.sort(canBos, new Comparator<CanBo>() {
            @Override
            public int compare(CanBo o1, CanBo o2) {
                return o1.getTuoi() > o2.getTuoi() ? -1 : 1;
            }
        });
        for(CanBo cb : canBos){
            System.out.println(cb.toString());
        }
    }
}
