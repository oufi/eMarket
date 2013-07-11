/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.io.Serializable;
import java.util.ArrayList;
//import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import model.Product;
import model.ShoppingCartItem;

/**
 *
 * @author mohammedoufi
 */
@ManagedBean
@SessionScoped
public class ShoppingCartManager implements Serializable{
private ArrayList<ShoppingCartItem> liste =new ArrayList<ShoppingCartItem>();
private Product prodToAdd = new Product();

   
    public ShoppingCartManager() {
        liste.clear();
    }

    public ArrayList<ShoppingCartItem> getListe() {
        return liste;
    }

    public void setListe(ArrayList<ShoppingCartItem> liste) {
        this.liste = liste;
    }

    public Product getProdToAdd() {
        return prodToAdd;
    }

    public void setProdToAdd(Product prodToAdd) {
        this.prodToAdd = prodToAdd;
    }
    
    
 /*   @PostConstruct
    public void initCart(){
    ShoppingCartItem shop = new ShoppingCartItem();
    Product prod =new Product(1,"Khobz",20.00);
    shop.setId(1);
    shop.setQtt(30);
    shop.setProduit(prod);
    liste.add(shop);
    }*/
    
    public String addToCarte(Product item){
    ShoppingCartItem shop =new ShoppingCartItem();
    //setProdToAdd(prodToAdd); 
    //shop.setId(10);
    this.prodToAdd = item;
    shop.setProduit(prodToAdd);
    shop.setQtt(2);
    liste.add(shop);
   return "catToShop";
    }
}
