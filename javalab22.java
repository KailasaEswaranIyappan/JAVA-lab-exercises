package javalab22;

public class javalab22 {
		  void m(){  
			  System.out.println("method is invoked");  
		  }  
			  void n(){  
			  this.m(); 
			  }  
		  void p(){  
			  n(); 
			  }  
			  public static void main(String args[]){  
			  javalab22 s1 = new javalab22();  
			  s1.p();  
			  }  


}
