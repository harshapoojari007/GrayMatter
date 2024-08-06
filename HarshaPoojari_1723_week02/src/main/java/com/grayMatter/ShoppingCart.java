package com.grayMatter;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	     private List<Item> items;
	     private double total=0;
	     private double payable=0;
	     private double discount=0;
	     private double tax=0;
	     private boolean couponValue=false;
	     
	     ShoppingCart() { 
	    	 items=new ArrayList<Item>();
		 } 
	     
		 public void addToCart(Item item) { 
			 items.add(item); 
		 } 
		 
		 public void showCart() { 
			 items.forEach(i->System.out.println(i.getProductName()+": "+i.getQuantity()));
		 } 
		 
		 public void removeFromCart(Item i) { 
			 items.remove(i);
		 } 
		 
		 public double getTotalAmount() { 
	     calculateTotalAmount();
		 return total;
		 } 
		 
		 public void applyCoupon(String coupon) { 
			 if(coupon.equals("IND10"))
				 couponValue=true;
		 } 
		 
		 public double getPayableAmount() { 
		     calculatePayableAmount();
			 return payable;
		 } 
		 
		 public void printInvoice() { 
			 items.forEach(i->System.out.println(i.getProductName()+": "+i.getQuantity()+" "+i.getUnitPrice()+" "+(i.getQuantity()*i.getUnitPrice())));
			 calculateTotalAmount();
			 calculatePayableAmount();
			 System.out.println("Total:"+getTotalAmount());
			 System.out.println("Disc%:"+discount);
			 System.out.println("Tax: "+String.format("%.2f", tax));
			 System.out.println("Total:"+getPayableAmount());
		}
		 
		public void calculateTotalAmount() {
			 total=items.stream().mapToDouble(i->i.getUnitPrice()*i.getQuantity()).sum();
			 
		}
		
		public void calculatePayableAmount() {
			 if(couponValue)
			 discount=total*0.1;
			 
			 payable=total-discount;
			 tax=payable*0.14;
			 payable=payable+tax;
		
		}
}
