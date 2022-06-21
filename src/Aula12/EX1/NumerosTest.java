package Aula12.EX1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class NumerosTest {

    public static void main(String[] args) throws FileNotFoundException {
      
      ArrayList<Integer> numeros = new ArrayList<>();
  
      Scanner sc = new Scanner(new File("numeros.txt"));
      while (sc.hasNextInt())
        numeros.add(sc.nextInt());
  
      // Alínea a)
      System.out.println(numeros);
  
      // Alínea b)
      int total = 0;
      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;
      for (int n : numeros) {
        total += n;
        if (n < min) min = n;
        if (n > max) max = n;
      }
      System.out.println("Média: " + total/numeros.size());
      System.out.println("Mínimo: " + min);
      System.out.println("Máximo: " + max);
  
      // Alínea c)
      PrintWriter out = new PrintWriter(new File("numeros_stat.txt"));
      String data = "Média: " + total/numeros.size();
      data += "\nMínimo: " + min;
      data += "\nMáximo: " + max;
      out.print(data);
      out.close();
      
    }
  
  }