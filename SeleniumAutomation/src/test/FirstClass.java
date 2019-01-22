package test;

public class FirstClass {

	public static void main(String[] args) {
		FirstClass obj = new FirstClass();
		obj.method1();
		obj.method2();
		method3();
		obj.method4();
		Secondclass.method3();

	}
	
	public void method1() {
		int a=20,b=30;
		int c =a+b;
		System.out.println("the result is "+c);
	}
	
	public void method2() {
		int a=20,b=30;
		int c =a-b;
		System.out.println("the result is "+c);
	}
	
	public static void method3() {
		int a=20,b=30;
		int c =a*b;
		System.out.println("the result is "+c);
	}
	
	public void method4() {
		int a=20,b=30;
		int c =a/b;
		System.out.println("the result is "+c);
	}


}
