package readerwriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessDemo {
public static void main(String[] args) {
	
	File file=new File("India.txt");
	try(RandomAccessFile ra=new RandomAccessFile(file,"rw")){
		System.out.println("File opened in readwrite mode. ");
		System.out.println("File pointer points 1st char of file");
		System.out.println(ra.length());
		ra.seek(1);
		int i=0;
		while(true) {
			i=ra.read();
			if(i==-1)
					break;
			System.out.print((char)i);
			ra.skipBytes(1);
		}
		System.out.println("----------------------");
		
		ra.seek(ra.length());
		ra.writeBytes("I am very fine");
		System.out.println("Contents written");
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("File autoclosed");
}
}
