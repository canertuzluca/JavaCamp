public class Main {
    public static void main(String[] args) {

        Product product = new Product(1,"Laptop","MSI Laptop",5000,3);
        // Product product = new Product();

        //product.setName("Laptop");
        //product.setId(1);
        //product.setDescription("MSI Laptop");
        //product.setPrice(5000);
        //product.setStockAmount(3);

        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println(product.getKod());


    }


}