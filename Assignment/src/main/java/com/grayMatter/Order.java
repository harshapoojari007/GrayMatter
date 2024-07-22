package com.grayMatter;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Order {
private int orderId;
private Date orderDate;
LinkedList<Item> items;

public int TotalOrderCost() {
	int total=0;
	Iterator<Item> i=items.iterator();
	while(i.hasNext())
	{
		Item i1=i.next();
		total+=i1.getPricePerUnit()*i1.getNoOfUnits();
	}
	return total;
}

}
