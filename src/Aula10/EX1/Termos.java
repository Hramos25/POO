package Aula10.EX1;

import java.util.Map;
import java.util.HashMap;

public class Termos {
    private Map<String, String> map;

    public Termos() {
        map = new HashMap<String, String>();
    }

    public void add (String termo, String definicao) {
        map.put(termo, definicao);
    }
    
    public void replace (String termo, String definicao) {
        map.replace(termo, definicao);
    }

    public void remove (String termo) {
        map.remove(termo);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()){
            sb.append(entry.getKey() + " - " + entry.getValue() + "\n");
        }

        for (String key : map.keySet()) {
            sb.append(key + "\n");
        }

        for (String value : map.values()) {
            sb.append(value + "\n");
        }
        return sb.toString().substring(0, sb.length() - 1);

    }


    
}
