package com.pose.object;
/**
 * 
 * @author zhangdd
 *	基本类型的初始化
 */
public class DefaultInitalize {
	/**
	 * char 16bit Unicode0 - Unicode2^16-1    Character
	 * byte 8bit -128-127 Byte
	 * short 16bit -2^15 - 2^15-1 Short
	 * int 32bit -2^31 - 2^31-1  Integer
	 * long 64bit -2^63 - 2^63-1
	 * float 32bit IEEE754  Float
	 * double 64bit IEEE754 Double
	 */
	public static int i;
	public static char c;
	public static float f;
	public static long l;
	public static boolean tf;
	public static byte b;
	public static double d;
	public static short s;
	public static void main(String[] args) {
		DefaultInitalize def = new DefaultInitalize();
		
		System.out.println("int is "+def.i);
		System.out.println("char is "+def.c);
		System.out.println("float is "+def.f);
		System.out.println("long is "+def.l);
		System.out.println("boolean is "+def.tf);
		System.out.println("byte is "+def.b);
		System.out.println("double is "+def.d);
		System.out.println("short is "+def.s);
		
	}

}
