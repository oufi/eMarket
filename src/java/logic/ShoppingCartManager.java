/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ApplicationScoped;
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
private ArrayList<ShoppingCartItem> liste;
private int ident;
private int qtt;
Product produit = new Product();

    public int getIdent() {
        return ident;
    }

    public void setIdent(int ident) {
        this.ident = ident;
    }

    public int getQtt() {
        return qtt;
    }

    public void setQtt(int qtt) {
        this.qtt = qtt;
    }


    public ShoppingCartManager() {
        liste.clear();
    }

    public ArrayList<ShoppingCartItem> getListe() {
        return liste;
    }

    public void setListe(ArrayList<ShoppingCartItem> liste) {
        this.liste = liste;
    }
    
    
}
