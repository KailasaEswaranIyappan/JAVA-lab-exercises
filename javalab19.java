package javalab19;

public class javalab19 {
		    int id;  
		    String name;  
		      
		    javalab19(int id,String name){  
		    this.id = id;  
		   this.name = name;  
	    }  
		    void display(){System.out.println(id+" "+name);}  
		  
		    public static void main(String args[]){  
		    javalab19 s1 = new javalab19(011,"Kailash");  
	    javalab19 s2 = new javalab19(004,"deepikha");  
		    s1.display();  
	    s2.display();  
	   }  


}
