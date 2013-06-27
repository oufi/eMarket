/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.io.Serializable;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import model.Product;

/**
 *
 * @author mohammedoufi
 */
@ManagedBean
@ApplicationScoped
public class CatalogManager implements Serializable{
    private int ident;
    private String name;
    private double price;
    private ArrayList<Product> myList = new ArrayList<Product>();
    Product produit=new Product();
    
    public CatalogManager(){}
 
    public ArrayList<Product> getMyList(){
    return this.myList;
    }
    
    public void setMyList(ArrayList<Product> l){
    this.myList=l;
    }
    
    public void setId(int ident){
        this.ident=ident;
    }
    
    public void setName(String name){
        this.name=name;
    }
    public void setPrice(double price){
        this.price=price;
    }
    
   
    @PostConstruct
    public void myInitMethode(){
   /*      Product produit = new Product();
        produit.setId(1);
        produit.setNom("Chirra");
        produit.setPrix(25);
        
        Product produit2 = new Product();
    
        produit2.setId(2);
        produit2.setNom("Kiff");
        produit2.setPrix(45);*/
        myList.add(produit);
    }
    
    
    
}

