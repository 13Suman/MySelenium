package SeleniumPack;

import java.util.LinkedList;

public class ListTest {

	public static void main(String[] args) {
		
		                  LinkedList lt = new LinkedList();
		                  lt.addFirst("Suman");
		                  lt.addLast("Sharma");
		                  lt.add(1, "Baghel");
		                  
		                  System.out.println(lt.getFirst());
		                  System.out.println(lt.get(1));
		                  System.out.println(lt.getLast());

	}

}
