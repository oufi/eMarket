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
    
    
    public CatalogManager(){}
    
    public ArrayList<Product> getMyList(){
    return this.myList;
    }
    
    public void setMyList(ArrayList<Product> l){
    this.myList=l;
    }
    
    
    @PostConstruct
    public void myAddtMethode(int id, String name, double prise){
        Product produit = new Product();
        produit.setId(id);
        produit.setNom(name);
        produit.setPrix(prise);
        
      
        
        //add the product to list product
       
        myList.add(produit);
       
        
    }
}

