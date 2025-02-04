
public class Main {

	public static void main(String[] args) {
		Array array = new Array(10);
		
		
		array.add(1);
		array.add(4);
		array.add(12);
		array.add(32);
		array.add(45);
		array.add(23);
		array.add(56);
		array.add(65);
		array.add(76);
		array.add(83);
		
		array.print();
		
		//array.search(4);
		//array.del(12);
		
		array.del(23);
		
		array.print();
		
		array.updt(4, 40);
		
		array.print();
		
		
	}

}
