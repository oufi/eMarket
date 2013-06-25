/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
    
    public List products = new ArrayList();
    
    public CatalogManager(){}
    
}
