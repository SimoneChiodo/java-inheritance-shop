package org.lesson.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Smartphone extends Prodotto {
  
  private int codeIMEI;
  private int storageAmount;

  Smartphone(){
    // Call the superclass Constructor
    super();

    // Generate a new random code
    this.codeIMEI = generateIMEICode();
  }
  
  Smartphone(String nome, String marca, BigDecimal prezzo, BigDecimal iva, int storageAmount){
    // Call the superclass Constructor
    super(nome, marca, prezzo, iva);

    // Generate a new random code
    this.codeIMEI = generateIMEICode();

    //Assign other values
    this.storageAmount = storageAmount;
  }


  // Getters & Setters
  public int getCodeIMEI(){
    return this.codeIMEI;
  }
  public void setCodeIMEI(int codeIMEI){
    this.codeIMEI = codeIMEI;
  }

  public int getStorageAmount(){
    return this.storageAmount;
  }
  public void setStorageAmount(int storageAmount){
    this.storageAmount = storageAmount;
  }

  // @Override
  public String toString(){
    return super.toString() + "Il codice IMEI e' " + this.codeIMEI + " e ha " + this.storageAmount + "GB di memoria disponibile. ";
  }

  // Functions
  private int generateIMEICode(){
    Random random = new Random();

    // Generate a new random code
    return random.nextInt(999999999);
  }

}
