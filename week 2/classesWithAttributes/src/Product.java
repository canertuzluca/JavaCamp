public class Product {

    public Product(int id, String name, String description, double price, int stockAmount) {

        System.out.println("Yapıcı blok çalıştı");
        this.id=id;
        this.name=name;
        this.description=description;
        this.price=price;
        this.stockAmount=stockAmount;
    }


    public Product() {

    }


    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private int id;

    String kod;

    public String getKod() {
        return this.name.substring(0, 1) + id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    //getter
    public int getId() {
        return id;
    }

    //setter
    public void setId(int id) {
        // this.id=id;       ->    //this = this class
        this.id = id;


    }
}
//Attribute | Field


//features of the product

//Get - to read
//Set - assign value


