package strings;

import java.util.Arrays;

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
		System.out.println(location==complocation); // address comparison in java
		System.out.println(loc==loc2);
		/*length, charAt, indexOf, lastIndexOf, contact, contains, substring, 
		 * toUppeCase, toLowerCase, isEmpty,isBlank, split, trim */
		int l=location.length();
		System.out.println(l);
		String s=" ";
		System.out.println(s.isEmpty());
		System.out.println(s.isBlank());
		
		System.out.println("-------String comparision-----");
		
		String country1="inDIA";
		String country2="india";
		boolean b=country1.toLowerCase().equals(country2.toLowerCase()); // case-sensitive
		System.out.println(b);
		System.out.println(country1);
		boolean b2=country1.equalsIgnoreCase(country2); // case-insensitive
		System.out.println(b2);
		int result=country1.compareTo(country2);
		System.out.println(result);
		 result=country1.compareToIgnoreCase(country2);
		System.out.println(result);
		
		String country3="inDIA   ";
		String country4="   india";
		b=country3.trim().toLowerCase().equals(country4.trim().toLowerCase()); // case-sensitive
		System.out.println(b);
		b=country3.trim().equalsIgnoreCase(country4.trim()); // case-insensitive
		System.out.println(b);
		
		country3="india is my country";
		System.out.println(country3.length());
		 country4="india";
		b=country3.trim().toLowerCase().equals(country4.trim().toLowerCase()); // case-sensitive
		System.out.println(b);
		b=country3.trim().equalsIgnoreCase(country4.trim()); // case-insensitive
		System.out.println(b);
		
		int comparision=country3.compareTo(country4);
		System.out.println(comparision);
		
		
		String cities[]= {"Pune","Mumbai","AhamadNagar","Nagpur", "pune","mumbai"};
		for(String city:cities) {
			System.out.println(city);
		}
		System.out.println();
		for(int i=0;i<cities.length;i++) {
			for(int j=i+1;j<cities.length;j++) {
				if(cities[i].compareToIgnoreCase(cities[j])>0) {
					String temp=cities[i];
					cities[i]=cities[j];
					cities[j]=temp;
				}
			}
		}
		System.out.println("After sort");
		for(String city:cities) {
			System.out.println(city);
		}
		
		Arrays.sort(cities);
	}
}
