public class CustomMain {
	
	public static void main(String[] args) {
		MyList coda1 = new MyList();
		MyList coda2 = new MyList();
		
		for(int i = 10; i <= 100; i += 10) {
			coda1.insert(i);
		}
		for(int i = 200; i <= 1000; i += 100) {
			coda2.insert(i);
		}
		
		coda1.print();
		coda2.print();
		MyList roba = coda1.concat(coda2);
		roba.print();
		System.out.println("_______________________-");
		coda1.print();
		coda2.print();
		
		
	}
}
