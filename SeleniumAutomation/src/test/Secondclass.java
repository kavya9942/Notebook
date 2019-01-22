package test;

public class Secondclass extends FirstClass {

	public static void main(String[] args) {
		
		Secondclass ff = new Secondclass();
		ff.method1();
		ff.method2();
		ff.method4();
		method3();
		ff.method5();
		
		
	}
	
	public  void method5() {
		String a ="abc";
		String b ="123";
		String c = a+b;
		System.out.println("the result is "+c);
		
	}

}
