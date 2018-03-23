//public class TestList {
//	public static void main (String[] args) {
//
//		int[] numeri = {
//				100, 200, 300
//		};
//
//		MyList L1 = new MyList();
//		MyList L2 = new MyList(numeri);
//
//		try {
//			L1.insert(13);   // aggiunge a fine lista
//			L1.insert(0,26); // inserisce in posizione 0
//			L1.remove(1);    // rimuove in posizione 1
//			L2.insert(0,14);
//			L1.concat(L2);   // concatena L2 con L1
//			L2.concat(L1).remove(1);
//
//			L1.print();
//			L2.print();
//
//			MyList L3 = L2.reverse_new(); // lascia L2 intatta
//			L3.insert(0,121);
//
//			L1.print();
//			L2.print();
//			L3.print();
//
//			L3.concat(L1).concat(L2).reverse_inplace(); // modifica l'oggetto corrente
//			L3.insert(2,141);
//			L3.clear(); // svuota la lista
//			L3.insert(1);
//
//			L3.print();
//
//			MyList L4 = new MyList(L3);
//			L4.remove(0);
//
//			L3.print();
//			L4.print();
//		}
//		catch (InvalidPositionException e) {
//			System.out.println("Posizione non valida!");
//		}
//		catch (EmptyListException f) {
//			System.out.println("Lista vuota!");
//		}
//	}
//}
