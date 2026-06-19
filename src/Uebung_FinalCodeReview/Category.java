package Uebung_FinalCodeReview;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private String id;
    public List<Product> Collection;
    public Category() {
        this.name="";
        this.id="";
        this.Collection=new ArrayList<Product>();
    }
    public Category(String name, String id) {
        this.name=name;
        this.id=id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public List<Product> getCollection() {
        return Collection;
    }
    public void setCollection(List<Product> collection) {
        Collection = collection;
    }
    public void addProduct(Product product){
        Collection.add(product);
    }
    public void removeProduct(Product product){
        Collection.remove(product);
    }
}
