/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesreport;

import java.text.DecimalFormat;

public class PrintProduct {

    private final IProducts products;

    public PrintProduct(IProducts products) {
        this.products = products;
    }

    public void PrintHeader() {
        System.out.println();
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("*".repeat(50));
    }

    public void PrintTotalProductSales() {
        System.out.println("TOTAL PRODUCT SALES: " + products.GetTotalProductsSold());
    }

    public void PrintAverageProductSales() {
        DecimalFormat df = new DecimalFormat("0.##");
        System.out.println("AVERAGE PRODUCT SALES: " + df.format(products.GetAverageProductSold()));
    }

    public void PrintMostPopularProduct() {
        System.out.println("MOST POPULAR PRODUCT: " + products.GetMostPopularProduct());
    }
}