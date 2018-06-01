package org.katas.refactoring;

import java.util.List;

public class Order {
	Customer customer;
    List<LineItem> li;
    double totalTax;
    double totalAmount;

    public Order(String nm, String addr, List<LineItem> li) {
    	this.customer=new Customer(nm,addr);
        this.li = li;
        this.totalTax=calculateTotalTax();
        this.totalAmount=calculateTotalAmount();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public String getCustomerAddress() {
        return customer.getAddress();
    }

    public List<LineItem> getLineItems() {
        return li;
    }
    public double calculateTotalTax(){
    	double totalSalesTax=0;
    	for(LineItem lineItem:li){
    		totalSalesTax+=lineItem.totalSalesTax();
    	} 	
    	return totalSalesTax;
    }
    public double calculateTotalAmount(){
    	double totalAmount=0;
    	for(LineItem lineItem:li){
    		totalAmount+=lineItem.totalAmount();
    	} 	
    	return totalAmount;
    }
    public String customerInfo(){
    	return customer.getName()+customer.getAddress();
    }
    public String totalAmountInfo(){
    	return "Sales Tax\t"+totalTax+"Total Amount\t"+(totalAmount+totalTax);
    }
}
