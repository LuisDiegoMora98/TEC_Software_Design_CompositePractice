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
public class SalesOrder {
    
    private long orderId;
    private String customer;
    private ArrayList<AbstractProduct> products;

    public SalesOrder() {
        this.products = new ArrayList<>();
    }
    
    public SalesOrder(long orderId, String customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }
    public SalesOrder(long orderId, String customer, ArrayList<AbstractProduct> products) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = products;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public ArrayList<AbstractProduct> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<AbstractProduct> products) {
        this.products = products;
    }
    
    public double getPrice(){
        double totalPrice = 0;
        for(AbstractProduct product : this.products){
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
    
    public void addProduct(AbstractProduct product){
        this.products.add(product);
    }

    public void  printOrder(){
        for(AbstractProduct product : this.products){
            System.out.println("SalesOrder: " + "orderId=" + orderId + ", customer:" + customer + ", products: " );
            System.out.println(product.toString());
        }
    }

   
    
}
