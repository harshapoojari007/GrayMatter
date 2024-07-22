package com.graymatter;

import java.util.Stack;

public class DemoOnStack {
public static void main(String[] args) {
	Stack<Integer> st=new Stack<Integer>();
	st.push(12345);
	st.push(1234);
	st.push(123);
	st.push(12);
	st.push(1);
	st.push(null);
	System.out.println(st);
	System.out.println(st.peek());
	System.out.println(st.pop());
	System.out.println(st.capacity());
	System.out.println(st.empty());
	System.out.println(st.toString());
	st.trimToSize();
	System.out.println(st.capacity());
	System.out.println(st.add(123456));
	System.out.println(st.capacity());
}
}
