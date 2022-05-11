package Assignment_01;

public class noOfcalls {

	public static void main(String[] args) {
		
		func obj = new func();
		obj.func1();
		obj.func1();
		obj.func1();
		
		System.out.println("Count= "+ func.count);
	}
}

class func
{
	static int count = 0;
	void func1() {
		count++;
	}
}