/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesreport;

public class Product extends IProducts {

    private final String[] productNames;   // single-dimensional array
    private final int[][] sales;           // two-dimensional array [product][month]

    public Product(String[] productNames, int[][] sales) {
        this.productNames = productNames;
        this.sales = sales;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int[] productSales : sales) {
            for (int monthSales : productSales) {
                total += monthSales;
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int count = 0;
        for (int[] productSales : sales) {
            count += productSales.length;
        }
        return count == 0 ? 0 : (double) GetTotalProductsSold() / count;
    }

    @Override
    public String GetMostPopularProduct() {
        int bestProduct = 0;
        int bestSale = Integer.MIN_VALUE;
        for (int p = 0; p < sales.length; p++) {
            for (int m = 0; m < sales[p].length; m++) {
                if (sales[p][m] > bestSale) {
                    bestSale = sales[p][m];
                    bestProduct = p;
                }
            }
        }
        return productNames[bestProduct] + " (" + bestSale + ")";
    }
}