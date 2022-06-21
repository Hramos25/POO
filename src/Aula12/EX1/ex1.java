package Aula12.EX1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) throws FileNotFoundException {

      Scanner sc = new Scanner(new FileInputStream("src/Aula12/EX1/word.txt"));
      
      sc.useDelimiter("[\\p{Punct}\\s]+");

      List<String> words = new ArrayList<String>();  
      while (sc.hasNext()) {
        String word = sc.next();
        words.add(word);
      }

      System.out.println("Número de palavras: " + words.size());
      System.out.println("Palavras Diferentes: " + new HashSet<String>(words).size() );
      
    }
  
  }