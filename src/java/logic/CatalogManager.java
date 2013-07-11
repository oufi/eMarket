/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import facade.ProductFacade;
import java.io.Serializable;
//import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
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
    
    private List<Product> myList = null;
    @EJB
    private ProductFacade productfacade;
  
    
    private Product produit = new Product();
    
    //private Product produit = new Product();
    public ProductFacade getProductfacade() {
        return productfacade;
    }

    public void setProductfacade(ProductFacade productfacade) {
        this.productfacade = productfacade;
    }

  
    public Product getProduit() {
        return produit;
    }

    public void setProduit(Product produit) {
        this.produit = produit;
    }

    

 
    
    public CatalogManager(){}
 
    public List<Product> getMyList(){
    return productfacade.findAll();
    }
    
    public void setMyList(List<Product> l){
    this.myList=l;
    }
    
    
  @PostConstruct
  public void initCat(){
  myList = productfacade.findAll();
  }
    public String createProduct(){
        productfacade.create(produit);
        
       return "catalog.xhtml";
            }
    
    
}

