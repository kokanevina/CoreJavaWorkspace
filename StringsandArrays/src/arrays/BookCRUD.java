package arrays;
/*DAO : Data Access Object : It works on POJO*/
public class BookCRUD{
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
		for(Book bk: bookArray) 
			System.out.println(bk);
	}
	
	public Book searchBook(int bookId) {
		Book searchedBook=null;
		for(Book bk:bookArray) {
			if(bk.getBookId()==bookId) {
				searchedBook=bk;
				break;
			}
		}// ended
		return searchedBook;  // null will returned if no book found
	}
	
	
}
