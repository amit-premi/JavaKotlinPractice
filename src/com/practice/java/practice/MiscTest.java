package com.practice.java.practice;

public class MiscTest {

	/*public static void displayResult(String s) {
		System.out.println("Display String");
	}*/

	/*
	public static void displayResult(Object obj) {
		System.out.println("Display Object");
	}

	public static void displayResult(int x) {
		System.out.println("Display Integer");
	}

	public static void displayResult(ArithmeticException ae) {
		System.out.println("Display Arithmetic Exception");
	}

	public static void main(String args[]) {
		displayResult(null);

		int x = 8;
		int y = 07_01;
		int z = 0X8F;

		System.out.println(z);
		System.out.println(x + y + z);
		
		System.out.println("Factorial of 5: "+factorial(5));
	}
	
	private static int factorial (int n) {
	    if (n == 1) {
	        return 1;
	    } else {
	        return n*factorial(n-1);
	    }
	} */
	/*public class Barclays {

    static class A{
        A(){
            f();
        }
        public void f(){
            System.out.println("A ctor");
        }
    }
    static class B extends A{
        B(){
            f();
        }
        public void f(){
            System.out.println("B ctor");
        }
    }
    public static void main(String[] args) {
        B b = new B();
        b.f();
        A a = new A();
        a.f();
    }

}
*/

/*public class Threading {
    int counter;
    class Mythread extends Thread{
        @Override
        public void run(){
            for(int i=0; i &lt; 10000; i++)
                counter++;
            System.out.println("run = " + counter);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        Threading a = new Threading();
        Mythread t1 = a.new Mythread();
        t1.start();
        t1.join();
        System.out.println("" + a.counter);
    }

}  */
	
}
