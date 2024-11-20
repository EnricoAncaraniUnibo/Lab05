package it.unibo.collections.design;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

import it.unibo.collections.design.api.Product;
import it.unibo.collections.design.api.Warehouse;

public class WarehouseImpl implements Warehouse{

    private final Collection<Product> set = new LinkedHashSet<>();

    @Override
    public void addProduct(Product p) {
        boolean add = true;
        for (Product product : set) {
            if(product.getName() == p.getName()) {
                add = false;
                if(product.getQuantity()<p.getQuantity()) {
                    set.remove(product);
                    set.add(p);
                    break;
                }
            }
        }
        if(add == true) {
            set.add(p);
        }
    }

    @Override
    public Set<String> allNames() {
        final Set<String> ris = new LinkedHashSet<>();
        for (Product p : set) {
            ris.add(p.getName());
        }
        return ris;
    }

    @Override
    public Set<Product> allProducts() {
        final Set<Product> ris = new LinkedHashSet<>();
        ris.addAll(set);
        return ris;
    }

    @Override
    public boolean containsProduct(Product p) {
        return set.contains(p);
    }

    @Override
    public double getQuantity(String name) {
        for (Product product : set) {
            if(name == product.getName()) {
                return product.getQuantity();
            }
        }
        return 0;
    }
    
}
