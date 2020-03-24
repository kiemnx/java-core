package lecture8;

import lecture6.CanBo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args){

        List<CanBo> canBos = new ArrayList<>();
        CanBo canBoMot = new CanBo("Mot", 12);
        CanBo canBoHai = new CanBo("Hai", 22);
        CanBo canBoBa = new CanBo("Ba", 10);
        CanBo canBoBon = new CanBo("Bon", 88);

        canBos.add(canBoMot);
        canBos.add(canBoHai);
        canBos.add(canBoBa);
        canBos.add(canBoBon);

        for(int i=0; i < canBos.size(); i ++){
            System.out.println(canBos.get(i).toString());
        }

        //Sap xep voi object user define:
        System.out.println("Sort descending by age");
        Collections.sort(canBos, new Comparator<CanBo>() {
            @Override
            public int compare(CanBo o1, CanBo o2) {
                return o1.getTuoi() > o2.getTuoi() ? -1 : 1;
            }
        });
        for(int i=0; i < canBos.size(); i ++){
            System.out.println(canBos.get(i).toString());
        }

        System.out.println("Sort ascending by age");
        Collections.sort(canBos, new Comparator<CanBo>() {
            @Override
            public int compare(CanBo o1, CanBo o2) {
                return o1.getTuoi() < o2.getTuoi() ? -1 : 1;
            }
        });
        for(int i=0; i < canBos.size(); i ++){
            System.out.println(canBos.get(i).toString());
        }

    }
}
