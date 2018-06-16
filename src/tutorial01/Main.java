package tutorial01;

import java.util.Scanner;

public class Main {
    private static ProductController productController;

    public static void main(String[] args){
        productController = new ProductController();

        System.out.println("### Product Registration ###");
        try(Scanner input = new Scanner(System.in)){
            String option;

            do{
                System.out.print("SKU: ");
                String sku = input.nextLine();
                System.out.print("Name: ");
                String name = input.nextLine();

                try {
                    productController.addProduct(sku, name);
                    System.out.println("Product saved with successful!");
                } catch (Exception exception){
                    System.err.println(exception.getMessage());
                    System.err.flush();
                }

                System.out.print("Do you want to add any more products? (Y/N)");
                option = input.nextLine();
            }while (option.equalsIgnoreCase("Y"));
        }

        System.out.println(productController.listProducts());
        System.out.println("### End ###");
    }
}
