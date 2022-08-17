package listdemos;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
/*List: indexed, duplicate allowed, multiple null allowed, ordered: insertion order followed
 *Vector : legacy class (generally not used), Stack: legacy LIFO
 *ArrayList : nonlegacy (most popular) : dynamic array, : contiguous memory allocation
 *LinkedList : non legacy (most popular): doubly linked list*/
	
	
	public static void main(String[] args) {
		List myList1=new ArrayList();
		myList1.add(234);
		myList1.add(234);
		myList1.add("dsad");
		myList1.add(45.67);
		System.out.println(myList1);
		//List<Integer> myList2=new ArrayList<>();  // used
		List<Integer> myList2=new ArrayList<Integer>();
		myList2.add(234);
		myList2.add(234);
		System.out.println(myList2);
		List<String> myList3=new ArrayList<String>();
		myList3.add("Hari");
		myList3.add("Krupas");
		System.out.println(myList3);
	}
}
