/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class03.Lession3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tran Viet Duc Anh
 */
public class TestProduct {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Enter Number Of Product : ");
        int n = Integer.parseInt(inp.nextLine());
        
        ArrayList<Product> pdts = new ArrayList<>();
        float maxPrice;
        
        for (int i = 0; i < n; i++) {
            Product pdt = new Product();
            System.out.println("\nInsert into the Product " + (i + 1) + " ");
            pdt.input();
            pdts.add(pdt);
        }
        System.out.println("***************************************");
        
        maxPrice = pdts.get(0).getPrice();
        System.out.println("The max price is: " + maxPrice);
        
        for (int i = 1; i < pdts.size(); i++) {
            if (pdts.get(i).getPrice() > maxPrice) {
                maxPrice = pdts.get(i).getPrice();
            }
        }
        
        System.out.println("List of the max price Product: ");
        for (int i = 0; i < pdts.size(); i++) {
            if (pdts.get(i).getPrice() == maxPrice) {
                pdts.get(i).display();
            }
        }
    }
}
