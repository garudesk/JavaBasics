package JavaBasic;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child obj = new Child();
		//obj.p1(); //inherited the parent class/methods.
		obj.p2();
		obj.c2();
		Parent obj1 = new Parent();
		
		Parent s = new Child();//Dynamic polymorphism.
		//s.p1();
		s.p2();
		s.c1();//method overridden
		
		Child  r = (Child)new Parent();
		
		

	}
}
	/*public class Parent{
		
	public void p1() {
		
	System.out.println("p1");	
	}
	
	public void p2() {
		
		System.out.println("p2");
		
	}
		
	}
	
	public class Child{
		
	public void c1()

{
		System.out.println("c1");
		
}
	
	public void c2()
	{
		System.out.println("c2");
}
	
	
		
	}
	

*/
