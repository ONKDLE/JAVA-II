import java.io.NumberForamatException;
public class ExTest {
	public static void parse(String str) {
		try {
			float f = Float.parseFloat(str);
			catch (NumberForamatException nfe) {
				
			}
			finally {
				System.out.println(f);
			}
		}
	}
	
	public static void main(String[] args) {
			parse("korea");
	}

}
