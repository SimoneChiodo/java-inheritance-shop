package org.lesson.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {
  public static void main(String[] args) {
    
    // Prodotto prodotto = new Prodotto();
    // System.out.println(prodotto.toString());
    // return;

    Scanner scanner = new Scanner(System.in);
    String choice2 = "y", carrello = "";

    for(int i = 1; choice2.equals("y"); i++){
      System.out.println("\nInserisci un prodotto: \n1- Smartphone \n2- Televisore \n3- Cuffie");

      int choice = scanner.nextInt();
      scanner.nextLine(); // This line consumes the \n character

      switch (choice) {
          case 1:
            System.out.println("\nHai scelto Smartphone. \nOra inserisci il nome: ");  
            String nome = scanner.nextLine();
            System.out.println("\nInserisci la marca: ");
            String marca = scanner.nextLine();
            System.out.println("\nInserisci il prezzo: (con il punto) ");
            BigDecimal prezzo = new BigDecimal(scanner.next());
            System.out.println("\nInserisci l'iva: (con il punto) ");
            BigDecimal iva = new BigDecimal(scanner.next());
            System.out.println("\nInserisci la memoria di archiviazione in GB: (numero intero) ");
            int storageAmount = scanner.nextInt();
            scanner.nextLine(); // This line consumes the \n character

            Smartphone smartphone = new Smartphone(nome, marca, prezzo, iva, storageAmount);
            carrello += "\n" + i + " - " + smartphone.toString();
            break;

          case 2:
            System.out.println("\nHai scelto Televisore. \nOra inserisci il nome: ");  
            nome = scanner.nextLine();
            System.out.println("\nInserisci la marca: ");
            marca = scanner.nextLine();
            System.out.println("\nInserisci il prezzo: (con il punto) ");
            prezzo = new BigDecimal(scanner.next());
            System.out.println("\nInserisci l'iva: (con il punto) ");
            iva = new BigDecimal(scanner.next());
            System.out.println("\nInserisci l'altezza: (in cm, con la virgola) ");
            float height = scanner.nextFloat();
            System.out.println("\nInserisci la larghezza: (in cm, con la virgola) ");
            float width = scanner.nextFloat();
            System.out.println("\nInserisci la profondita': (in cm, con la virgola) ");
            float depth = scanner.nextFloat();
            String isSmartString = "y";
            do{
              if(!isSmartString.equals("y") && !isSmartString.equals("n"))
                System.out.println("\nIl valore inserito non e' accettato!");
              System.out.println("\nE' una smart TV? (Y/N) ");
              isSmartString = scanner.nextLine().toLowerCase();
            } while(!isSmartString.equals("y") && !isSmartString.equals("n"));
            boolean isSmart = isSmartString == "y" ? true : false;
            
            Televisore televisore = new Televisore(nome, marca, prezzo, iva, isSmart, height, width, depth);
            carrello += "\n" + i + " - " + televisore.toString();
            break;

          case 3:
            System.out.println("\nHai scelto Cuffie. \nOra inserisci il nome: ");  
            nome = scanner.nextLine();
            System.out.println("\nInserisci la marca: ");
            marca = scanner.nextLine();
            System.out.println("\nInserisci il prezzo: (con il punto) ");
            prezzo = new BigDecimal(scanner.next());
            System.out.println("\nInserisci l'iva: (con il punto) ");
            iva = new BigDecimal(scanner.next());
            System.out.println("\nInserisci il colore: ");
            String color = scanner.nextLine();
            String isWirelessString = "y";
            do{
              if(!isWirelessString.equals("y") && !isWirelessString.equals("n"))
                System.out.println("\nIl valore inserito non e' accettato!");
              System.out.println("\nSono Wireless? (Y/N) ");
              isWirelessString = scanner.nextLine().toLowerCase();
            } while(!isWirelessString.equals("y") && !isWirelessString.equals("n"));
            boolean isWireless = isWirelessString == "y" ? true : false;

            Cuffie cuffie = new Cuffie(nome, marca, prezzo, iva, color, isWireless);
            carrello += "\n" + i + " - " + cuffie.toString();
            break;
      }

      do{
        if(!choice2.equals("y") && !choice2.equals("n"))
          System.out.println("\nIl valore inserito non e' accettato!");
        System.out.println("\n\nVuoi inserire un altro prodotto? (Y/N)");
        choice2 = scanner.nextLine();
        choice2 = choice2.toLowerCase();
        System.out.println(choice2);
      } while(!choice2.equals("y") && !choice2.equals("n"));
    }
    
    scanner.close();
    System.out.println("\n\nResoconto del carrello: " + carrello);

  }
}
