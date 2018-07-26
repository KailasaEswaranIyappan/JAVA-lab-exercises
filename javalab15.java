package javalab15;

public class javalab15 {

		    int id;  
		    String name;  
		    javalab15(int i,String n){  
		    id = i;  
		    name = n;  
		    }  
		      
		    javalab15(javalab15 s){  
		    id = s.id;  
		    name =s.name;  
		    }  
		    void display(){System.out.println(id+" "+name);}  
		   
		    public static void main(String args[]){  
		    	javalab15 s1 = new javalab15(111,"Kailash");  
		    	javalab15 s2 = new javalab15(s1);  
		    s1.display();  
		    s2.display();  
	   }  

}
