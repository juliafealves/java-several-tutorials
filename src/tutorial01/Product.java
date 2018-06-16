package tutorial01;

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
     * Return information formated with SKU - Name.
     * @return String SKU - Name
     */
    @Override
    public String toString() {
        return this.sku + " - " + this.name;
    }
}
