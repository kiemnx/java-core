package lecture8;

import lecture6.CanBo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args){

        Map<String, CanBo> map = new HashMap<>();

        CanBo canBoMot = new CanBo("Mot", 30);
        CanBo canBoHai = new CanBo("Hai", 12);
        CanBo canBoBa = new CanBo("Ba", 31);
        CanBo canBoBon = new CanBo("Bon", 23);

        map.put("Mot", canBoMot);
        map.put("Hai", canBoHai);
        map.put("Ba", canBoBa);
        map.put("Bon", canBoBon);

        Set<String> key = map.keySet();

        System.out.println(map.size());

        CanBo result = map.get("Hai");
        System.out.println(result.getHoTen() + " " + result.getTuoi());

    }
}
