package org.lesson.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {
  
  private String color;
  private boolean isWireless;

  Cuffie(){
    // Call the superclass Constructor
    super();
  }
  
  Cuffie(String nome, String marca, BigDecimal prezzo, BigDecimal iva, String color, boolean isWireless){
    // Call the superclass Constructor
    super(nome, marca, prezzo, iva);

    //Assign other values
    this.color = color;
    this.isWireless = isWireless;
  }


  // Getters & Setters
  public String getColor(){
    return this.color;
  }
  public void setColor(String color){
    this.color = color;
  }
  
  public boolean getIsWireless(){
    return this.isWireless;
  }
  public void setIsWireless(boolean isWireless){
    this.isWireless = isWireless;
  }

  public String toString(){
    return super.toString() + "Sono di colore " + this.color + " e " + (this.isWireless ? "sono wireless." : "non sono wireless.");
  }

}
