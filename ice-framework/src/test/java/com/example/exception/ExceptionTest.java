package com.example.exception;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExceptionTest {

	@Test
	public void test() throws Exception {
		RuntimeException e1=new RuntimeException("inner exception");
		Exception e2=new Exception("outer exception",e1);
		System.out.println("e1"+e1);
		System.out.println("e2"+e2);

		//int[] as=new int[3,5]();
		int a=2/0;
		System.out.println(a);
		throw e2;
	}

}
