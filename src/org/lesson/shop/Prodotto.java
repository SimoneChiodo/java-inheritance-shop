package org.lesson.shop;

import java.math.BigDecimal;

import java.util.Random;

public class Prodotto {

  private int code;
  private String nome;
  private String marca;
  private BigDecimal prezzo;
  private BigDecimal iva;

  Prodotto(){
    // Generate a new random code
    this.code = generateCode();
  }

  Prodotto(String nome, String marca, BigDecimal prezzo, BigDecimal iva){
    // Generate a new random code
    this.code = generateCode();
    //Assign other values
    this.nome = nome;
    this.marca = marca;
    this.prezzo = prezzo;
    this.iva = iva;
  }

  // Getter & Setter
  public int getCode(){
    return this.code;
  }

  public String getNome(){
    return this.nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getMarca(){
    return this.marca;
  }

  public void setMarca(String marca){
    this.marca = marca;
  }

  public BigDecimal getPrezzo(){
    return this.prezzo;
  }

  public void setPrezzo(BigDecimal prezzo){
    this.prezzo = prezzo;
  }

  public BigDecimal getIva(){
    return this.iva;
  }

  public void setIva(BigDecimal iva){
    this.iva = iva;
  }

  public String toString(){
    return "Questo prodotto e' un " + nome + " di " + marca + ". Costa " + prezzo + " euro + " + iva +" di IVA.";
  }

  // Functions
  private int generateCode(){
    Random random = new Random();

    // Generate a new random code
    return random.nextInt(99999);
  }

}
