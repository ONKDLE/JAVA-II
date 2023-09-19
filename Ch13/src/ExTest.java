
public class ExTest {
	public static void parse(String str) {
		try {
			float f = Float.parseFloat(str);
		}
		catch (Exception nfe) {
			
		}
		finally {
			System.out.println(f);
		}
	}
	
	
	public static void main(String[] args) {
			parse("korea");
	}

}
