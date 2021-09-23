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
public class SimpleProduct extends AbstractProduct {
    private String brand;
    
    public SimpleProduct(String name, double price, String brand){
        super(name, price);
        this.brand = brand;
        
    }
    
    public String getBrand(){
        return brand;
    }
    
    public void setBrand(String brand){
        this.brand = brand;
    }
    
    
    @Override
    public String toString(){
        
        return "    SimpleProduct{Name: " + super.getName() +  ", price: " + super.getPrice() + ", brand" + brand + "}";
    }
}
