import java.util.Iterator;
import java.util.LinkedList;

public class LinkyListy {

	public static void main(String[] args) {

		LinkedList<Integer> linky = new LinkedList<Integer>();
		
		linky.add(5);
		linky.add(12);
		linky.add(13);
		
		//System.out.println(linky);
		
		Iterator it = linky.iterator();
		while(it.hasNext())
		{
			if((int) it.next() == 12) {
				System.out.println("12 is here!");
			}
		}
	}
}
