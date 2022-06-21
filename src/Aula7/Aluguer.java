package Aula7;

import java.util.Scanner;

public abstract class Aluguer {

    public String getName(String message, Scanner sc){
        System.out.print(message);
        return sc.next();
    }
    
    public String getEndereco(String message, Scanner sc){
        System.out.print(message);
        return sc.next();
    }

    public void alojamento(String pass, String name, String local, double preco, boolean disponibilidade, double avaliacao ){
        
    }
}
