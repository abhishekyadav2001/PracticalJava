package Unit_02; //Inside package we can create many classes

import static java.lang.System.*;
import static java.lang.Math.*;

import Unit_01.SampleClass1;

public class P11_Task02_ImportAndPackagesInJava {

	public static void main(String[] args) {
		
		out.println("Welcome to package");
		
		out.println(sqrt(16));
		out.println(pow(2,2));
		out.println(Math.abs(4.2));
		
		SampleClass1 obj = new SampleClass1();
		System.out.println(obj.a);
	}

}
