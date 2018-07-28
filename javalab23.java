package javalab23;

public class javalab23 {
	void m(javalab23 obj){  
			  System.out.println("method is invoked");  
			  }  
			  void p(){  
			  m(this);  
			  }  
		    
			  public static void main(String args[]){  
			  javalab23 s1 = new javalab23();  
		  s1.p();  
			  }  

}
