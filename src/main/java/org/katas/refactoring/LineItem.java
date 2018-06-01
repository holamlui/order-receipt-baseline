package org.katas.refactoring;

public class LineItem {
	private String desc;
	private double p;
	private int qty;

	public LineItem(String desc, double p, int qty) {
		super();
		this.desc = desc;
		this.p = p;
		this.qty = qty;
	}

	public String getDescription() {
		return desc;
	}

	public double getPrice() {
		return p;
	}

	public int getQuantity() {
		return qty;
	}
    double totalAmount() {
        return p * qty;
    }
    double totalSalesTax(){
    	return this.totalAmount()*.10;
    }
    double totalAmountIncludeTax(){
    	return this.totalAmount()+this.totalSalesTax();
    }
    public String getAllInfo(){
    	return desc+'\t'+p+'\t'+qty+'\t'+this.totalAmount()+'\n';
    }
}