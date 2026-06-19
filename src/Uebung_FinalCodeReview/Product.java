package Uebung_FinalCodeReview;

import java.util.HashMap;

public class Product {
    private String name;
    private int sku;
    private int preis;
    public HashMap<String,Product> Products;
    public Product(String name,int sku,int preis){
        this.name=name;
        this.sku=sku;
        this.preis=preis;
        Products=new HashMap<String,Product>();
    }
    public Product(String name,int sku){
        this.name=name;
        this.sku=sku;
        Products=new HashMap<String,Product>();
    }
    public Product(){
        Products=new HashMap<String,Product>();
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getSku(){
        return sku;
    }
    public void setSku(int sku){
        this.sku=sku;
    }
    public int getPreis(){
        return preis;
    }
    public void setPreis(int preis){
        this.preis=preis;
    }
    public HashMap<String,Product> getProducts(){
        return Products;
    }
    public void setProducts(HashMap<String,Product> products){
        Products=products;
    }
}
