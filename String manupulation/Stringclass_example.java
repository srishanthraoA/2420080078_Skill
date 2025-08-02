package srisproject;

public class Stringclass_example {
	public static void main (String args[]) {
		String Str="hello this is java class";
		String Str1="hello";
		String Str2="hi how are you";
		String Str3="heLLo";
		String Str4="hello";
		String Str5="1234";
		String Str6="Java234";
		String Str7="";
		String Str8="  hello java  ";
		System.out.println(Str.length());
		System.out.println(Str2.toUpperCase());
		System.out.println(Str.toLowerCase());
		System.out.println(Str3.charAt(2));
		System.out.println(Str1.compareTo(Str4));
		System.out.println(Str1.compareToIgnoreCase(Str3));
		System.out.println(Str1.concat(Str3));
		System.out.println(Str1.contains("ehl"));
		System.out.println(Str1.contentEquals(Str3));
		System.out.println(Str1.endsWith("lo"));
		System.out.println(Str1.equals(Str4));
		System.out.println(Str1.indexOf("l"));
		System.out.println(Str1.equalsIgnoreCase(Str4));
		System.out.println(Str6.matches("[0-9a-zA-z]+"));//+ is single or multiple occurrences. * is zero or many, ? is 0 or 1.
		System.out.println(Str7.isEmpty());
		System.out.println(String.join("!",Str2,Str3,Str4));
		System.out.println(Str1.lastIndexOf('l'));
		System.out.println(Str1.replace('l','p'));
		String str11="hi;how;are;you";
		String Str10[]=str11.split(";");
		for (String i:Str10) {
			System.out.println(i);
			
		}
		System.out.println(Str6.startsWith("J"));
		System.out.println(Str.subSequence(5,12));
		System.out.println(Str8.trim());
		System.out.println(String.valueOf(9.5f));
		char arr[]=Str4.toCharArray();
		System.out.println(arr);
	}

}