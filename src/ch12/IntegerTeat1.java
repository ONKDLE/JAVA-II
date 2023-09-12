package ch12;

public class IntegerTeat1 {

	public static void main(String[] args) {
		Integer num1 = new Integer(13);	 // valueof() 메소드 사용.
		Integer num2 = 25;  //Autoboxing를 이용한 방법
		num2 = num1 + num2; 
		System.out.println("num1이 포장하고 있는 정수는 : " +num1.intValue());
		System.out.println("num2이 포장하고 있는 정수는 : "+num2);
		System.out.println("두수의 합 = " + num2);
												//클래스 메소드 호출.
		System.out.println("합의 2진 표현 : " + Integer.toBinaryString(num2));
		System.out.println("합의 8진 표현 : " + Integer.toOctalString(num2));
		System.out.println("합의 16진 표현 : " + Integer.toHexString(num2));
		System.out.println("if(num1 == num2)는 : " + num1.equals(num2));
		
		Integer num3 = new Integer("444"); //valueOf 메서드를 이용한 방법
		System.out.println("문자열 '444'의 같은 : " + num3.intValue());
		System.out.println("2진수 '1001001'의 10진 값은 : " + Integer.parseInt("1001001", 2));
	}

}
