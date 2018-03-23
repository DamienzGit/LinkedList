public class CustomMain {
	
	public static void main(String[] args) {
		MyList damiano = new MyList();
		
		for (int i=10; i<=100; i+=10) {
			damiano.insert(i);
		}
		damiano.print();
		
		damiano.insert(5, 55);
		damiano.print();
	}
	
}
