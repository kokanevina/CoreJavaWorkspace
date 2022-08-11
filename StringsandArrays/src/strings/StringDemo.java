package strings;

public class StringDemo {
	public static void main(String[] args) {
		char charArray[]={'w','e','l','c','o','m','e'};
		String s1="welcome";   //index :0..  String literals : literal pool
		String s2=new String(charArray);  // String object with new, heap
		String s3=new String("Hello");
		String s4=new String(s1);
		String s5=s1;
		String s6=new String();
		
		
		String cname="Neosoft";
		String newname=cname+" Technology";
		System.out.println(cname);
		System.out.println(newname);
		cname=cname.toUpperCase();  // original object gets unreferred
		System.out.println(cname);
		
		String location=new String("Rabale");
		String complocation=new String("Rabale");
		String loc="Rabale";
		String loc2="Rabale";
		/*duplicate objects can be available in heap but not in literal pool*/
		System.out.println(location==complocation);
		System.out.println(loc==loc2);
		/*length, charAt, indexOf, lastIndexOf, contact, contains, substring, 
		 * toUppeCase, toLowerCase, isEmpty,isBlank split */
		int l=location.length();
		System.out.println(l);
		String s=" ";
	}
}
