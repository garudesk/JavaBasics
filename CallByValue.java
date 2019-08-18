package JavaBasic;

public class CallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x = 10;
		int y = 20;
		CallByValue obj = new CallByValue();
		obj.sum(x, y);
		//System.out.println(c);

	}
	
	
	public int sum(int a,int b) {
	
		int c = a + b ;
		
		return c;
		//System.out.println(c);
		
	}

}
