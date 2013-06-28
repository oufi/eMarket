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
    
    private ArrayList<Product> myList = new ArrayList<Product>();
    private Product produit = new Product();

    public Product getProduit() {
        return produit;
    }

    public void setProduit(Product produit) {
        this.produit = produit;
    }
    
    
    public CatalogManager(){}
 
    public ArrayList<Product> getMyList(){
    return this.myList;
    }
    
    public void setMyList(ArrayList<Product> l){
    this.myList=l;
    }
    
    public void addProduct(Product produit){
        
        this.produit = produit;
        myList.add(produit);
        
       
      
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

