package Aula9.ex1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import Aula7.Date;
import Aula7.DateYMD;

public class ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> c1= new ArrayList<>();
        for(int i= 10; i<= 100; i+=10) 
            c1.add(i);
        System.out.println("Size: "+ c1.size());
        for(int i= 0; i< c1.size(); i++) 
            System.out.println("Elemento: "+ c1.get(i));
        
        ArrayList<String> c2= new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        c2.remove("Frio");
        c2.remove(0);
        System.out.println(c2);
        c2.add("Ameno");
        System.out.println(c2);
        c2.set(1,"Frio");
        System.out.println(c2);
        c2.get(1);
        System.out.println(c2);
        // c2.clear();
        // System.out.println(c2);
        c2.size();
        System.out.println(c2);
        for (String i : c2){
            System.out.println(i);
        }
        //   HashSet<String> c3 =new 
        // HashSet<String>();
        // c3.add("Frio");
        // c3.contains("calor");
        // System.out.println(c3);
        
        
        Set<Pessoa> c3 = new HashSet<>();
        c3.add(new Pessoa("João", 145, new DateYMD(10, 10, 1990)));
        c3.add(new Pessoa("Maria", 145, new DateYMD(10, 10, 1990)));
        c3.add(new Pessoa("Toine", 500, new DateYMD(10, 10, 1991)));
        
        for (Pessoa i : c3){
            System.out.println(i);
        }
        
        Set <Date> c4 = new TreeSet<>();

        c4.add(new DateYMD(10, 5, 2020));
        c4.add(new DateYMD(10, 1, 2020));
        c4.add(new DateYMD(10, 10, 2020));
        c4.add(new DateYMD(10, 10, 2021));
        c4.add(new DateYMD(10, 10, 2022));
        System.out.println(c4);
        

    }  
}
