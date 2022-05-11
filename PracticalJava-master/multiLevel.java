package Assignment_01;

public class multiLevel {

	public static void main(String[] args) {
		System.out.println("Calling object one(parameterized) : ");
		ClassThree obj1 =  new ClassThree(1);
		
		System.out.println("Calling object two(default): ");
		ClassThree obj2 =  new ClassThree();
		
		System.out.println(obj1);
		
		System.out.println(obj2);
		

	}

}

class ClassOne
{
	ClassOne(int a){
		System.out.println("In classone");
	}
}

class ClassTwo extends ClassOne
{

	ClassTwo(){
		super(2);
		System.out.println("In classTwo");
	}
	
}

class ClassThree extends ClassTwo
{

	ClassThree(){
		System.out.println("In classThree(default)");
	}
	
	ClassThree(int a){
		System.out.println("In classThree(Param)");
	}
}