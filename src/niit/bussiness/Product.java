package niit.bussiness;

import java.util.Scanner;

public class Product {
    private String productID;
    private String productName;
    private double importPrice;
    private double exportPrice;
    private double tax;
    private double profit;

    public Product() {
    }

    public Product(String productID, String productName, double importPrice, double exportPrice, double tax, double profit) {
        this.productID = productID;
        this.productName = productName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.tax = tax;
        this.profit = profit;
    }

    public String getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public double getImportPrice() {
        return importPrice;
    }

    public double getExportPrice() {
        return exportPrice;
    }

    public double getTax() {
        return tax;
    }

    public double getProfit() {
        return profit;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setImportPrice(double importPrice) {
        this.importPrice = importPrice;
    }

    public void setExportPrice(double exportPrice) {
        this.exportPrice = exportPrice;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public Product inputData(Scanner scanner){
        Product product=new Product();
        System.out.println("ProductID: ");
        product.setProductID(scanner.nextLine());
        System.out.println("Product Name: ");
        product.setProductName(scanner.nextLine());
        System.out.println("Import Price: ");
        product.setImportPrice(scanner.nextDouble());
        System.out.println("Export Price: ");
        product.setExportPrice(scanner.nextDouble());
        System.out.println("Tax: ");
        product.setTax(scanner.nextDouble());
        return product;
    }

    public void displayData(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID='" + productID + '\'' +
                ", productName='" + productName + '\'' +
                ", importPrice=" + importPrice +
                ", exportPrice=" + exportPrice +
                ", tax=" + tax +
                ", profit=" + profit +
                '}';
    }

    public void calProfit(){
        setProfit(getExportPrice()-getImportPrice()-getTax());
    }
}
