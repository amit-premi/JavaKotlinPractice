package com.practice.java.common;

public class OOPSPrac {

    static class A {
        int aCount;

        A() {
            System.out.println("A: constructor");
            //f();
        }

        public void f() {
            aCount++;
            System.out.println("A ctor");
            //System.out.println("A's f() bCounter: "+aCount);
        }
    }

    static class B extends A {
        int bCount;

        B() {
            System.out.println("B: constructor");
            //f();
        }

        public void f() {
            bCount++;
            System.out.println("B ctor");
            //System.out.println("B's f() bCounter: "+bCount);
        }
    }

    public static void main(String[] args) {
		/*B b = new B();
		b.f();*/
		/*A a = new A();
		a.f();*/

        A ab = new B();
        ab.f();
    }
}
