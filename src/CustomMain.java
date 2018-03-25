public class CustomMain {
	
	public static void main(String[] args) {
		MyList coda1 = new MyList();
		
		for(int i = 10; i <= 100; i += 10) {
			coda1.insert(i);
		}
		coda1.print();
		try {
			coda1.insert(3, 111);
			coda1.print();
			coda1.insert(5, 222);
			coda1.print();
		} catch(InvalidPositionException e) {
			e.printStackTrace();
		}
		
		
	}
}
