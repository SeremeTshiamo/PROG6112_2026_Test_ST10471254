PROG6112 2026 Test: Mattress Sales Application

Student: Tshiamo Sereme
Student number: ST10471254
Module: PROG6112
Institution: The Independent Institute of Education (IIE MSA)

Overview

A Java Maven project for a local company that specialises in mattress sales. It contains two applications:

Question 1: Sales Report (console). Captures three months of sales for three mattress products and prints a product sales report.
Question 2: Product App (Swing GUI). Captures a customer sale, calculates VAT, commission and the total sale amount, and saves the result to data.txt.
Technologies
Java (JDK 17 or later)
Apache Maven
Java Swing (GUI)
JUnit 5 (unit testing)
Apache NetBeans
Git and GitHub Desktop
Project structure
MatressSales/
├── pom.xml
└── src/
    ├── main/java/
    │   ├── com/mycompany/salesreport/
    │   │   ├── IProducts.java
    │   │   ├── Product.java
    │   │   ├── PrintProduct.java
    │   │   └── Main.java
    │   └── ProductApp/
    │       ├── IProductCalculations.java
    │       ├── ProductCalculations.java
    │       └── ProductApp.java
    └── test/java/
        ├── com/mycompany/salesreport/ProductTest.java
        └── ProductApp/ProductCalculationsTest.java
Question 1: Sales Report

The user enters the number of sales for months 1 to 3 for each of these products:

Cozy Nights Monarch
Restonic Barbados
Sealy Phuket

The program uses a single-dimensional array for the product names and a two-dimensional array ([product][month]) for the sales figures.

Classes
Class / Interface	Purpose
IProducts	Interface with GetTotalProductsSold(), GetAverageProductSold() and GetMostPopularProduct()
Product	Implements IProducts and performs the calculations
PrintProduct	Prints the total, the average and the most popular product
Main	Captures user input and runs the report
Sample output
PRODUCT SALES REPORT - 2026
**************************************************
TOTAL PRODUCT SALES: 153
AVERAGE PRODUCT SALES: 17
MOST POPULAR PRODUCT: Cozy Nights Monarch (63)

The most popular product is the one with the highest total sales over the three months.

Question 2: Product App

The form captures the customer name, the product (combo box) and the price. When PROCESS is clicked, the app shows a message dialog and saves the details to data.txt.

Calculations
Item	Formula
VAT	15% of the product price
Commission	5% of the product price
Total	Price + VAT + Commission

Example: a price of R3500 gives VAT R525.0, commission R175.0 and a total of R4200.0.

Menu
File: Exit (closes the application)
Tools:
Process (runs the same logic as the Process button)
Clear (empties the text boxes and resets the combo box to index 0)
Classes
Class / Interface	Purpose
IProductCalculations	Interface with GetVat(), GetCommission() and GetTotal()
ProductCalculations	Implements IProductCalculations
ProductApp	Swing GUI, menu, input validation and file saving
data.txt format
DATA LOG
********************************
Customer Name: Joe Bloggs
Product: Cozy Nights Monarch
VAT: R 525.0
COMMISSION: R 175.0
TOTAL: R 4200.0
********************************
Unit tests
Test	Class tested	Purpose
GetTotalProductSales_WithValidData_ReturnsCorrectValue()	Product	Checks the total products sold
GetAverageSales_WithValidData_ReturnsCorrectValue()	Product	Checks the average products sold
GetVat_WithValidData_ReturnsCorrectValue()	ProductCalculations	Checks the VAT amount
GetTotal_WithValidData_ReturnsCorrectValue()	ProductCalculations	Checks the total sale amount

To run the tests in NetBeans, right-click the project and choose Test. From the command line, run mvn test.

How to run
In NetBeans
Choose File > Open Project and select the project folder.
Right-click the project and choose Clean and Build.
To run Question 1, right-click Main.java and choose Run File.
To run Question 2, right-click ProductApp.java and choose Run File.
From the command line
mvn clean install
Version control

The project is stored in the GitHub repository PROG6112_2026_Test_ST10471254. The target/ folder is excluded through .gitignore.
