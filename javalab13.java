package javalab13;

public class javalab13 {
		    int id;  
		    String name;  
		      
		    javalab13(int i,String n){  
	    id = i;  
		    name = n;  
	    }  
	    void display(){System.out.println(id+" "+name);}  
	   
		    public static void main(String args[]){  
		    javalab13 s1 = new javalab13(111,"Kailash");  
		    javalab13 s2 = new javalab13(222,"eswaran");  
		    s1.display();  
	    s2.display();  
	  }  

}
