package javalab14;

public class javalab14 {
	int id;  
	    String name;  
		    int age;  
		    javalab14(int i,String n){  
		    id = i;  
	    name = n;  
		    }  
		    javalab14(int i,String n,int a){  
	    id = i;  
		    name = n;  
		    age=a;  
		    }  
		    void display(){System.out.println(id+" "+name+" "+age);}  
		   
 	    public static void main(String args[]){  
	    javalab14 s1 = new javalab14(111,"Kailash",19);  
		    javalab14 s2 = new javalab14(222,"vinoth",19);  
		    s1.display();  
		    s2.display();  
		   }  


}
