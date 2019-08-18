package JavaBasic;

import java.util.Hashtable;

public class Hash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Hashtable h = new Hashtable();
	
	h.put("A", 100);
	h.put("B", 200);
	h.put(1, 20000);
	
	System.out.println(h.get("B"));
	System.out.println(h.size());
	System.out.println(h.get(1));

	}

}
