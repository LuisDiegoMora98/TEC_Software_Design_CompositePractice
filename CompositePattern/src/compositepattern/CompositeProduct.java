/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepattern;

import java.util.ArrayList;

/**
 *
 * @author Natalia
 */
public class CompositeProduct extends AbstractProduct {
    public ArrayList<AbstractProduct> children;
    
    public CompositeProduct(String pName, double pPrice){
        this.name = pName;
        this.price = pPrice;
    }

    public ArrayList<AbstractProduct> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<AbstractProduct> pChildren) {
        this.children = pChildren;
    }
    
    public void addProduct(AbstractProduct pProduct){
        this.children.add(pProduct);
    }
    
    @Override
    public double getPrice(){
        double total = this.price;
        for(AbstractProduct product : this.children){
            total += product.getPrice();
        }
        return total;
    }
}
