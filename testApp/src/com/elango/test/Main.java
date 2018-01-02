package com.elango.test;

public class Main {

    public static void main(String[] args) {
        String tempVar= NewClass.staticMethod("test");
        String tempVar2= NewClass.staticMethod("test1");


        NewClass new1=new NewClass();
        String tempvar3=new1.nonStaticMethod("test2");
        NewClass new2=new NewClass();
        String tempvar4=new2.nonStaticMethod("test3");

        System.out.println(tempVar+" "+tempVar2+" "+tempvar3+" "+tempvar4);
	// write your code here
    }
}
