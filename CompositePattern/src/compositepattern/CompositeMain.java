/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepattern;

import java.util.Random;

/**
 *
 * @author Natalia
 */
public class CompositeMain {

    private final Random random = new Random();
    private SimpleProduct ram4gb;
    private SimpleProduct ram8gb;
    private SimpleProduct disk500gb;
    private SimpleProduct disk1tb;
    private SimpleProduct cpuAMD;
    private SimpleProduct cpuIntel;
    private SimpleProduct smallCabinete;
    private SimpleProduct bigCabinete;
    private SimpleProduct monitor20inch;
    private SimpleProduct monitor30inch;
    private SimpleProduct simpleMouse;
    private SimpleProduct gammerMouse;
    
    private CompositeProduct gammerPC;
    private CompositeProduct homePC;
    private CompositeProduct pc2x1;


    private void buildProducts() {
        //Construcción de productos simples
        ram4gb = new SimpleProduct("Memoria RAM 4GB", 750, "KingStone");
        ram8gb = new SimpleProduct("Memoria RAM 8GB", 1000, "KingStone");
        disk500gb = new SimpleProduct("Disco Duro 500GB", 1500, "ACME");
        disk1tb = new SimpleProduct("Disco Duro 1TB", 2000, "ACME");  
        cpuAMD = new SimpleProduct("AMD phenon", 4000, "AMD");       
        cpuIntel = new SimpleProduct("Intel i7", 4500, "Intel");    
        smallCabinete = new SimpleProduct("Gabinete Pequeï¿½o", 2000, "ExCom"); 
        bigCabinete = new SimpleProduct("Gabinete Grande", 2200, "ExCom"); 
        monitor20inch = new SimpleProduct("Monitor 20'", 1500, "HP");
        monitor30inch = new SimpleProduct("Monitor 30'", 2000, "HP");
        simpleMouse = new SimpleProduct("Raton Simple", 150, "Genius");
        gammerMouse = new SimpleProduct("Raton Gammer", 750, "Alien");
        
        //Computadora para Gammer que incluye 8gb de ram,disco de 1tb,procesador Intel i7          
        //Gabinete grande, monitor de 30' y un mouse gammer.
        gammerPC = new CompositeProduct("Gammer PC");   
        gammerPC.addProduct(ram8gb);   
        gammerPC.addProduct(disk1tb);   
        gammerPC.addProduct(cpuIntel);   
        gammerPC.addProduct(bigCabinete);   
        gammerPC.addProduct(monitor30inch);   
        gammerPC.addProduct(gammerMouse);
        
        //Computadora para Casa que incluye 4gb de ram,disco de 500gb, procesador AMD Phenon         
        //Gabinete chico, monitor de 20' y un mouse simple.           
        homePC = new CompositeProduct("Casa PC");
        homePC.addProduct(ram4gb);
        homePC.addProduct(disk500gb);
        homePC.addProduct(cpuAMD);
        homePC.addProduct(smallCabinete);
        homePC.addProduct(monitor20inch);
        homePC.addProduct(simpleMouse);
        
        //Paque compuesto de dos paquetes: paquete Gammer PC y Home PC           
        pc2x1 = new CompositeProduct("Paquete PC Gammer + Casa");   
        pc2x1.addProduct(gammerPC);
        pc2x1.addProduct(homePC);
    }

    private void orderSimpleProducts() {
        SalesOrder simpleProductOrder = new SalesOrder(random.nextInt(), "Rene Mora");
        simpleProductOrder.addProduct(ram4gb);
        simpleProductOrder.addProduct(disk1tb);
        simpleProductOrder.addProduct(simpleMouse);
        simpleProductOrder.printOrder();   
    }       
    
    private void orderGammerPC() {
        SalesOrder gammerOrder = new SalesOrder(1, "Juan Perez");
        gammerOrder.addProduct(gammerPC);
        gammerOrder.printOrder();
    }       
    
    private void orderHomePC() {
        SalesOrder homeOrder = new SalesOrder(2, "Marcos Guerra");
        homeOrder.addProduct(homePC);   homeOrder.printOrder(); 
    }       
    
    private void orderCombo() {
        SalesOrder comboOrder = new SalesOrder(3, "Paquete 2x1 en PC");
        comboOrder.addProduct(pc2x1);
        comboOrder.printOrder();   
    }
    
    private void orderBig() {
        SalesOrder customOrder = new SalesOrder(4, "Diego Mora"); 
        customOrder.addProduct(homePC);
        customOrder.addProduct(ram8gb);
        customOrder.addProduct(ram4gb);   
        customOrder.addProduct(monitor30inch);
        customOrder.addProduct(gammerMouse);
        customOrder.printOrder();
    }
        
    public static void main(String[] args) {
        
        /*
        Natalia Vargas Reyes
        Luis Diego Alemán
        Luis Diego Mora
        */
        CompositeMain main = new CompositeMain();
        main.buildProducts();
        main.orderSimpleProducts();
        main.orderHomePC();
        main.orderGammerPC();
        main.orderCombo();
        main.orderBig();

        
        
    }
    
}