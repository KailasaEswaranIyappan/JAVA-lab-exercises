package javalab6;

public class javalab6 {
		 int length;  
		 int width;  
		  
		 void insert(int l,int w){  
		  length=l;  
		  width=w;  
		 }  
		  
		 void calculateArea(){System.out.println(length*width);}  
		  
		 public static void main(String args[]){  
			 javalab6 r1=new javalab6(),r2=new javalab6(); 
		    
	  r1.insert(11,5);  
		  r2.insert(3,15);  
		  
	  r1.calculateArea();  
		  r2.calculateArea();  
	}  


}
