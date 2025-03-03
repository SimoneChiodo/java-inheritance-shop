package org.lesson.shop;

import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {
    Smartphone telefono = new Smartphone("Telephones", "Samzung", new BigDecimal(200), new BigDecimal(0.22f), 120);

    System.out.println(telefono.getNome());
    System.out.println(telefono.getCode());

  }
}
