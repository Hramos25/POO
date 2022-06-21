package Aula10.EX2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Random;

public class Termos2 {
    private SortedMap<String, ArrayList<String>>map;

    public Termos2() {
        map = new TreeMap<String, ArrayList<String>>();
    }

    public void add(String termo, String ...definicao){
        map.put(termo, new ArrayList<String>(Arrays.asList(definicao)));
    }

    public void addDefinicao(String termo, String definicao){
        if (map.containsKey(termo)){
            map.get(termo).add(definicao);
        }else{
            map.put(termo, new ArrayList<String>(Arrays.asList(definicao)));
        }
    }

    public void removeDefinicao (String termo, String definicao){
        if (map.containsKey(termo)){
            map.get(termo).remove(definicao);
        }
    }

    public String randomDefinicao (String termo){
        if (map.containsKey(termo)){
            ArrayList<String> definicao = map.get(termo);
            Random r = new Random();
            return definicao.get(r.nextInt(definicao.size()));
        }else{
            return null;
        }
    }

    public void replace (String termo, String ...definicao){
        map.replace(termo, new ArrayList<String>(Arrays.asList(definicao)));

    }

    public void remove(String termo){
        map.remove(termo);

    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()){
            sb.append(entry.getKey() + " - " + entry.getValue() + "\n");
        }   

        for (String key : map.keySet()){
            sb.append(key + "\n");

        }

        for (ArrayList<String> value : map.values()){
            sb.append(value + "\n");
        }

        return sb.toString().substring(0, sb.length() - 1);
    }
}
