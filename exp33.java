class Student16{  
	void message(){System.out.println("welcome");}  
	}  
	  
	class Exp33 extends Student16{  
	void message(){System.out.println("welcome to java");}  
	  
	void display(){  
	message();//will invoke current class message() method  
	super.message();//will invoke parent class message() method  
	}  
	  
	public static void main(String args[]){  
	Exp33 s=new Exp33();  
	s.display();  
	}  
	}  