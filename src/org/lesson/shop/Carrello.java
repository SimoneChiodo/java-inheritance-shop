package org.lesson.shop;

import java.util.Scanner;

public class Carrello {
  public static void main(String[] args) {
    
    // Prodotto prodotto = new Prodotto();
    // System.out.println(prodotto.toString());
    // return;

    Scanner scanner = new Scanner(System.in);

    for(String choice2 = "y"; choice2 != "n";){
      System.out.println("Inserisci un prodotto: \n1- Smartphone \n2- Televisore \n3- Cuffie");

      int choice = scanner.nextInt();
      switch (choice) {
          case 1:
            Smartphone smartphone = new Smartphone();
            break;

          case 2:
            Televisore televisore = new Televisore();
            break;

          case 3:
            Cuffie cuffie = new Cuffie();
            break;
      }

      do{
        if(choice2 != "y" || choice2 != "n")
          System.out.println("\nIl valore inserito non e' accettato!");
        System.out.println("\n\nVuoi inserire un altro prodotto? (Y/N)");
        choice2 = scanner.nextLine().toLowerCase();
      } while(choice2 != "y" || choice2 != "n");
    }
    
    scanner.close();

  }
}
