package com.grayMatter.Calculator;

import java.util.Scanner;

public class DemoOnArray {
	public static boolean isPrime(int a)
	{
		for(int i=2;i<=Math.sqrt(a);i++)
		{
			if(a%i==0)
				return false;
		}
		return true;
		
	}
	
	public static boolean lssearch(int a[],int key)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
				return true;
		}
		return false;
	}
	
	public static boolean bisearch(int a[],int key)
	{
		int low=0;
		int high=a.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(a[mid]==key)
				return true;
			if(key<a[mid])
			{
				high=mid-1;
				
			}
				
			if(key>a[mid])
			{

				low=mid+1;
			    
			}
				
		}
		return false;
	}
	
	
	public static void bubbleSort(int a[])
	{
		for(int i=1;i<a.length;i++)
		{
			for(int j=0;j<a.length-i;j++)
			if(a[j]>a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	
	public static void countDuplicates(int a[],int j)
	{

		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==j)
				count++;;
		}
		System.out.println("Count="+count);
	}

	public static int[] insertElement(int []arr,int ele,int pos) {
		if(pos>arr.length || pos <0) {
			System.out.println("Invalid Position");
			return arr;
		}
		else {
			int length=0;
			for(int i:arr)
			{
				if(i!=0)
					length++;
			}
			if(length==arr.length)
			{
				int newArr[]=new int[arr.length+(arr.length/2)];
				for(int i=0;i<pos-1;i++)
				{
					newArr[i]=arr[i];
				}
				for(int i=arr.length-1;i>=pos;i--)
				{
					newArr[i]=arr[i-1];
				}
				newArr[pos-1]=ele;
				return newArr;
			
			}else {
				for(int i=arr.length-1;i>=pos;i--)
				{
					arr[i]=arr[i-1];
				}
				arr[pos-1]=ele;
				return arr;
				
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[5];
//		int []arr1= {1,2,3,4,5};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter thr elements");
		for(int i=0;i<5;i++)
			arr[i]=sc.nextInt();
		
//		for(int i:arr)
//		{
//			if(i%2==0)
//				System.out.println(i);
//		}
//		
//		int sum=0;
//		for(int i:arr)
//		{
//			sum+=i;
//			
//		}
//		System.out.println(sum);
//		
//		for(int i:arr)
//		{
//			System.out.println(i+"-->"+isPrime(i));
//			
//		}
//		if(lssearch(arr,5)) {
//			System.out.println("Element Found");
//		}else {
//			System.out.println("Not Found");
//		}
//		
//		if(bisearch(arr,9)) {
//			System.out.println("Element Found");
//		}else {
//			System.out.println("Not Found");
//		}
//		
//		bubbleSort(arr);
//		System.out.println("Sorted List");
//		for(int i:arr)
//			{
//					 System.out.println(i);
//			}
//		
//		//Duplicates count
//		
//		
//		countDuplicates(arr,5);
//		
		System.out.println("Enter the element to Insert:");
		int ele=sc.nextInt();
		System.out.println("Enter the position to Insert");
		int pos=sc.nextInt();
		arr=insertElement(arr,ele,pos);
		
		for(int i:arr)
		{
				 System.out.println(i);
		}

	}

}
