package b_package;
import a_package.Test1;
//import a_package.*;

public class Test2 {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		System.out.println(t1.sum(10, 20));
	}

}
