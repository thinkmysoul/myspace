
public class DataOnlyTest {

	/**
	 * @param args
	 */
	
		int i;
		double d;
		boolean b;
		void show() {
			System.out.println(i);
			System.out.println(d);
			System.out.println(b);	
		}
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataOnlyTest da=new DataOnlyTest();
		//da.i=23;
		//da.d=4.567;
		//da.b=false;
		da.show();
		class StoreStuff {
			int storage(String s) {
				return s.length() * 10;
			}	
		}
		StoreStuff x = new StoreStuff();
		System.out.println(x.storage("hello"));	
		
	}

}
