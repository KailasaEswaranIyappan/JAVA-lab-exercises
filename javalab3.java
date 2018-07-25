package javalab3;

public class javalab3 {
		 int rollno;  
		 String name;  
		  
		 void insertRecord(int r, String n){  
		  rollno=r;  
		  name=n;  
	 }  
	  
		 void displayInformation(){System.out.println(rollno+" "+name);}
		  
	 public static void main(String args[]){  
		  javalab3 s1=new javalab3();  
		  javalab3 s2=new javalab3();  
	  
		  s1.insertRecord(111,"Kailash");  
	  s2.insertRecord(222,"deepikha");  
		  
	  s1.displayInformation();  
		  s2.displayInformation();  
		  
		 }  
		}  
	



