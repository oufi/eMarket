/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.*;



/**
 *
 * @author mohammedoufi
 */
@Entity
@Table(name="PRODUCT")
public class Product implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    @Column(name = "NAME")
    private String nom;
    
    @Column(name = "SELLING_PRICE")
    private double prix;
    
    public Product(){}

    public Product(String nom, double prix) {
        
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
