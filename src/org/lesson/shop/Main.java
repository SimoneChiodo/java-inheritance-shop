package org.lesson.shop;

import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {
    Smartphone telefono = new Smartphone("Telephones", "Samzung", new BigDecimal(200), new BigDecimal(0.22f), 120);

    System.out.println("Some Smartphone info: ");
    System.out.println(telefono.getNome());
    System.out.println(telefono.getCodeIMEI());

    Televisore televisione = new Televisore("Telvision", "LGS", new BigDecimal(200), new BigDecimal(0.22), false, 22f, 80.3f, 2.2f);

    System.out.println("\nSome Television info: ");
    System.out.println(televisione.getNome());
    System.out.println(televisione.getIsSmart() ? "It's smart" : "It's not smart");

  }
}
