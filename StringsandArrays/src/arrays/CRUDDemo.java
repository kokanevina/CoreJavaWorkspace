package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CRUDDemo {
	Book bookArray[]=new Book[5];
	public static int i=0;
	
	public boolean addBook(Book book) {
		 if(book!=null) {
				bookArray[i]=book;
				i++;
				return true;
		 }
		 else
			 return false;
	}
	public void display() {
		for(Book bk: bookArray) {
			System.out.println(bk);
		}
	}
	
public static void main(String[] args) throws IOException {
	CRUDDemo crud=new CRUDDemo();
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Scanner sc=new Scanner(System.in);
	int ch=0;
	do {
		System.out.println("1: ADD BOOK \n 2:UPDATE BOOK \n3: DELETE BOOK\n 4: SEARCH BOOK\n 5: DISPLAY BOOKS\n 6:BACK");
		ch=sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("Enter Book Id");
			int id=sc.nextInt();
			System.out.println("Enter Book Name");
			String name=br.readLine();
			System.out.println("Enter Book Price");
			double price=sc.nextDouble();
			Book book=new Book(id,name,price); // Book Object created
			boolean b=crud.addBook(book);
			if(b)
				System.out.println("Book Added successfully...");
			else
				System.out.println("Book insertion failed...");
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			crud.display();
			break;
		case 6:
			break;
		default:
			break;
	}
	}while(ch!=6);
}
}
