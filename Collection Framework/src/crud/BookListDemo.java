package crud;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BookListDemo {
public static void main(String[] args) {
	/*
	 * Collections : class 
	 * Collection : interface
	 * 
	 * 
	 */
	List<Integer> numList=new LinkedList<>();
	numList.add(34);
	numList.add(14);
	numList.add(345);
	numList.add(324);
	numList.add(14);
	System.out.println(numList);
	Collections.sort(numList); // mutable
	System.out.println(numList);
	
	List<String> nameList=new LinkedList<>();
	nameList.add("Pawan");
	nameList.add("Kumar");
	nameList.add("Amar");
	nameList.add("amar");
	nameList.add("Amrapali");
	nameList.add("Pooja");
	System.out.println(nameList);
	Collections.sort(nameList); // merge sort
	System.out.println(nameList);
	
	List<Book> bkList=new LinkedList<>();
	bkList.add(new Book(2,"Java",600));
	bkList.add(new Book(1,"PHP",300));
	bkList.add(new Book(12,"CPP",400));
	bkList.add(new Book(10,"Core Java",600));
	bkList.add(new Book(13,"Java Basics",700));
	bkList.add(new Book(15," Learn Python",650));
	bkList.add(new Book(14,"Web Basics",550));
	for(Book bk:bkList)
			System.out.println(bk);
	Collections.sort(bkList); // to sort custom object. We have to make them comparable (able to compare)
	for(Book bk:bkList)
		System.out.println(bk);
	
	/*45 <->23 , "hi" <-> "hello"   (2,"java",600) <-> (1,"php",500)*/
	/*custom sorting : Comparator interfaces,
	 * sorting on only one property : Comparable  interface (lang ), compareTo(Object to compare)*/
}
}
