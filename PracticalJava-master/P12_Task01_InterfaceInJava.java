package Unit_02;

//Interface is a completely(100%) "abstract class"

//Need? ----- multiple interface can be implemented

interface Animal{
	public void animalSound();
	public void run();
}

interface Human{
	public void humanSound();
	public void run1();
}


public class P12_Task01_InterfaceInJava implements Animal {

	public static void main(String[] args) {
		
		C1 obj = new C1();
		obj.funcA();
		obj.funcB();
		
	}
	
	public void animalSound() {
		
	}
	
	public void run() {
		
	}

}

//Multiple implements
class Species implements Animal,Human{

	@Override
	public void humanSound() {
		System.out.println("We are inside humanSOund method");
		
	}

	@Override
	public void run1() {
		System.out.println("We are inside run1 method");
		
	}

	@Override
	public void animalSound() {
		System.out.println("We are inside animalSound method");
		
	}

	@Override
	public void run() {
		System.out.println("We are inside run method");
		
	}
	
}

interface A1{
	void funcA();
}

interface B1 extends A1{
	void funcB();
}

class C1 implements B1{

	@Override
	public void funcA() {
		System.out.println("THis is funA from A1");
		
	}

	@Override
	public void funcB() {
		System.out.println("This is funcB from B1");
		
	}
	
}
