/*
Cài đặt lớp Product gồm các thuộc tính (phải khai báo là private)

-       String maHH;

-       String tenHH;

-       float soLuong;

-       float gia1SP;

Cài đặt 2 construcors, các hàm get/set.

Cài đặt hàm input(), display().

Khai báo hàm main và thực hiện như sau:

-       Khai báo mảng có n phần tử kiểu Product.

-       Gọi nhập thông tin cho các phần tử của mảng.

-       Tìm ra sản phẩm nào có giá bán cao nhất.
 */
package Class03.Lession3;

import java.util.Scanner;

/**
 *
 * @author Tran Viet Duc Anh
 */
public class Product {
    private String id, name;
    private float quantity, price;
    
    public Product(){
    }
    
    public Product(String id, String name, float quantity, float price){
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public float getQuantity(){
        return quantity;
    }
    
    public void setQuantity(float quantity){
        this.quantity = quantity;
    }
    
    public float getPrice(){
        return price;
    }
    
    public void setPrice(){
        this.price = price;
    }
    
    public void input(){
        Scanner inp = new Scanner(System.in);
        
    System.out.println("Enter Product ID:  ");
    id = inp.nextLine();
    
    System.out.println("\nEnter Product name: ");
    name = inp.nextLine();
    
    System.out.println("\nEnter Product quantity: ");
    quantity = Float.parseFloat(inp.nextLine());
    
    System.out.println("\nEnter Product price: ");
    price = Float.parseFloat(inp.nextLine());
    }
    
    public void display(){
        System.out.println("Product ID: " + id);
        System.out.println("Product name: " + name);
        System.out.println("Product quantity: " + quantity);
        System.out.println("Product price: " + price);
    }
}