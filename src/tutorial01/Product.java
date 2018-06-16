package tutorial01;

import java.util.Objects;

public class Product {
    private String sku;
    private String name;

    /**
     * Created a product with sku and name.
     * @param sku Unique
     * @param name Product name
     */
    public Product(String sku, String name){
        this.sku = sku;
        this.name = name;
    }

    /**
     * Verify if two objects are equals.
     * An object is equal to another, if SKUs are equals.
     *
     * @param object
     * @return Return true if objects are equals.
     */
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Product product = (Product) object;

        return Objects.equals(sku, product.sku);
    }

    /**
     * Generates a hash through the SKU.
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(sku);
    }

    /**
     * Return information formated with SKU - Name.
     * @return String SKU - Name
     */
    @Override
    public String toString() {
        return this.sku + " - " + this.name;
    }
}
