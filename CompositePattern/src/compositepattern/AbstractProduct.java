/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepattern;

/**
 *
 * @author Natalia
 */
public abstract class AbstractProduct {
    protected String name;
    protected double price;

    public AbstractProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public AbstractProduct() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "AbstractProduct{" + "name= " + getName() + ", price= " + getPrice() + '}';
    }
    
    
    
}
