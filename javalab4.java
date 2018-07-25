package javalab4;

public class javalab4 {
	 int length;  
	 int width;  
		  
	 void insert(int l,int w){  
		  length=l;  
		  width=w;  
		 }  
		  
		 void calculateAreaofRECTANGLE(){System.out.println(length*width);}  
		  
		 public static void main(String args[]){  
			 javalab4  r1=new javalab4();  
			 javalab4 r2=new javalab4();  
		  
		  r1.insert(11,5);  
		  r2.insert(3,15);  
		  
	  r1.calculateAreaofRECTANGLE();  
		  r2.calculateAreaofRECTANGLE();  
		}  


}
