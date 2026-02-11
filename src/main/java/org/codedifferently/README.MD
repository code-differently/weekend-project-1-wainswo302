# 🧾 Fatboy Freddy's Fictional Fast Food

## Overview

This Java program simulates a dining experience at a fictitional fast-casual restaurant, Fatboy Freddy's. Users input name 
and budget and the program simulates cost of goods and sales tax. It then compares the user's budget to the final total of the items,
minus any discount codes, letting the user know if they have enough funds or not. 

---

## How it works

The program takes input for the user's:
* name
* budget
* A discount code.

A receipt is then generated containing:

* The name of the store
* A receipt code
* 3 item prices
* Subtotal
* Price adjustments containing any price modifiers, such as tax and discount if applicable
* The final total
---
Sample Input & Output
----------------------------------------------------------------
********************Final Receipt*********************
Appetizer costs: $14.64
Entree costs: $10.29
Drink costs: $5.69
Discount: $0.0
Here's your discounted pre-tax total: $30.62
Sales tax: $1.27 (Simulated tax rate: 0.04%)
Total due: $31.89
You cannot afford this transaction!
You are short by $1.89
VisitID: KEL49961
---------------------------------------------------------------

## Java Concepts Used
The following Java concepts are used in this project:

* Declaration and initialization of variables
* Organization of multiple classes with calls to methods within them from Main();
* Collecting user input using `Scanner`
* Generating random values using the `Random` class
* The `Math` class and its functions
* Manipulating and validating text using the `String` class
* (`if / else`) conditional statements