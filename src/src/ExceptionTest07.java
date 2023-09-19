/*
 * 나이를 입력 받아 출력하시오.
 * 입력받은 나이가 정수가 아닌 경우 예외처리 하시오.
 */
import java.util.Scanner;
public class ExceptionTest07 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		
		try {
			int age = Integer.parseInt(stdIn.next());
			System.out.println(age);
		} catch (NumberFormatException e) {
			System.out.println("나이를 정수로 입력하시오. : " + e);
			
		} finally { //생략 가능
			System.out.println("프로그램 종료.");
		}
	}

}

