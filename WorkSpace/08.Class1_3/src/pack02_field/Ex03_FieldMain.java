package pack02_field;

import java.util.Scanner;

public class Ex03_FieldMain {
	public static void main(String[] args) {
		Ex03_FieldValue field = new Ex03_FieldValue();
		
		
		System.out.println(field.booleanField);//true & false
		System.out.println(field.charField);//''
		System.out.println(field.doubleField);
		System.out.println(field.floatField);
		System.out.println(field.intField);
		System.out.println(field.longField);
		System.out.println(field.arr1Field);
		System.out.println(field.arr2Field);
		System.out.println(field.byteField);
		System.out.println(field.car);
		
		field.car = new Ex02_Car();
		System.out.println(field.car);
		System.out.println(field.car.company);
		
		Scanner sc = new Scanner(System.in);
		
	
	}
}
