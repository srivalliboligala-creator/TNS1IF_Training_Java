package org.tnsif.acc.c2tc.interfacedemo;

 public class main {
	
	public static void main(String[] args) {
		MathOp obj;

        obj = new Add();
        System.out.println(obj.operate(10, 5));  // 15

        obj = new Sub();
        System.out.println(obj.operate(10, 5));  // 5
	// TODO Auto-generated method stub	


