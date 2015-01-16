// TIJ4 Chapter Object, Exericise 1, page 89
// object/PrimitiveTest.java
// Create a class containing an int and a char that are not intitialized
// and print their values to verify that Java performs default initialization.
/**
 * 
 */

/**
 * @author Think
 *
 */
public class PrimitiveTest {

	/**
	 * @param args
	 */
	static int i;
	static char c;	
	int ii;
	char b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("int = " + i);
		System.out.println("char = " + c);
		PrimitiveTest pt=new PrimitiveTest();
		pt.ii=980;
		pt.b='8';
		System.out.println("int ="+pt.ii);
		System.out.println("char b="+pt.b);
	}

}
