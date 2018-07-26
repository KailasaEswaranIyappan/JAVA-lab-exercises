package javalab18;

public class javalab18 {
	     int rollno;  
		     String name;  
		     static String college = "ITS";  
		       
		     static void change(){  
		     college = "RIT"; 	     }  
	  
	     javalab18(int r, String n){  
		     rollno = r;  
		     name = n;  
		     }  
		  
		     void display (){System.out.println(rollno+" "+name+" "+college);}  
		  
		    public static void main(String args[]){  
		    	javalab18.change();  	  
		    	javalab18 s1 = new javalab18 (111,"kailash");  
		    	javalab18 s2 = new javalab18 (222,"vinoth");  
		    	javalab18 s3 = new javalab18 (333,"deepikha");  
		  
	    s1.display();  
		    s2.display();  
	    s3.display();  
	    }  


}
