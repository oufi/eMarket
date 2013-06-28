/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author mohammedoufi
 */
public class Product implements Serializable{
    private int id;
    private String nom;
    private double prix;
    
    public Product(){}

    public Product(int id, String nom, double prix) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
    }

    
    public int getId(){
        return this.id;
    }
    public String getNom(){
        return this.nom;
    }
    public double getPrix(){
        return this.prix;
    }
    
    
    public void setId(int ident){
    
        this.id=ident;
    }
    
   public void setNom(String name){
   
       this.nom=name;
   } 
   
   public void setPrix(double price){
   
       this.prix=price;
   }
}
