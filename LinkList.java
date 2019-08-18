package JavaBasic;

import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("Suhas");
		ll.add("Kantilal");
		ll.add("Garude");
		
		System.out.println(ll);
		System.out.println(ll.get(1));

		ll.set(1, "Surekha");
		System.out.println(ll.get(1));
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		
		for(int n=0;n<ll.size();n++)
		{
			System.out.println(ll.get(n));
		}
		for(String str : ll) {//advanced for loop
			
			
			System.out.println(ll);

			
		}
		}
		
		}
		
		//ll.removeAll(ll);
		
		//System.out.println(ll);



		

	


