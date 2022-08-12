package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CRUDDemo {
public static void main(String[] args) throws IOException {
	BookCRUD crud=new BookCRUD();
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
			System.out.println("Enter id to search book");
			 id=sc.nextInt();
			 Book searchedBook=crud.searchBook(id);
			 if(searchedBook!=null)
				 System.out.println(searchedBook);
			 else
				 System.out.println("Book Not Found");
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
