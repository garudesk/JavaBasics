package JavaBasic;

import java.util.ArrayList;

public class ArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		ArrayList ar = new ArrayList();
		ar.clear();
		
		ar.add(10);
		ar.add(20);
		ar.add(300);
		ar.add("Suhas");
		
		System.out.println(ar.size());
		System.out.println(ar.get(2));
		
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ar1.add(22);
		//ar1.add(12.12);

	}

}
