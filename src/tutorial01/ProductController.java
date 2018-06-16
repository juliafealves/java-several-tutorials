package tutorial01;

import java.util.Collection;
import java.util.HashSet;
import java.util.NoSuchElementException;

public class ProductController {
    private Collection<Product> products = new HashSet<>();

    /**
     * Add a product.
     * @param sku Unique SKU
     * @param name Product Name
     * @return Return true when saved product.
     */
    public boolean addProduct(String sku, String name){
        Product product = new Product(sku, name);

        if(this.products.contains(product))
            throw new NoSuchElementException("This product has already been added. Use another SKU!");

        this.products.add(product);

        return true;
    }

    /**
     * Return all products added.
     * @return
     */
    public String listProducts(){
        StringBuilder products = new StringBuilder();
        int index = 1;

        for (Product product : this.products)
            products.append(index++)
                    .append(". ")
                    .append(product)
                    .append(System.lineSeparator());

        return products.toString();
    }
}
