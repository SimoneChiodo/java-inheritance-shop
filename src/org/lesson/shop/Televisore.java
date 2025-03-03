package org.lesson.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Televisore extends Prodotto {
  
  private float height;
  private float width;
  private float depth;
  private boolean isSmart;

  Televisore(){
    // Call the superclass Constructor
    super();

    // Generate random mesures
    this.height = generateMesure();
    this.width = generateMesure();
    this.depth = generateMesure();

    //Assign other values
    this.isSmart = false;
  }
  
  Televisore(String nome, String marca, BigDecimal prezzo, BigDecimal iva, Boolean isSmart, float height, float width, float depth){
    // Call the superclass Constructor
    super(nome, marca, prezzo, iva);

    // Generate a new random code
    this.isSmart = isSmart;

    //Assign other values
    this.height = height;
    this.width = width;
    this.depth = depth;
  }


  // Getters & Setters
  public float getHeight(){
    return this.height;
  }
  public void setHeight(float height){
    this.height = height;
  }
  
  public float getWidth(){
    return this.width;
  }
  public void setWidth(float width){
    this.width = width;
  }
  
  public float getDepth(){
    return this.depth;
  }
  public void setDepth(float depth){
    this.depth = depth;
  }

  public boolean getIsSmart(){
    return this.isSmart;
  }
  public void setIsSmart(boolean isSmart){
    this.isSmart = isSmart;
  }


  // Functions
  private float generateMesure(){
    Random random = new Random();

    // Generate a new random code
    return random.nextFloat(152.99f);
  }

}
