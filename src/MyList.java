public class MyList {
	
	private MyList prev;
	private MyList next;
	
	Integer val;
	
	static int pos_in;
	static int pos_re;
	
	// funziona
	MyList() {
	
	}
	
	// funziona
	MyList(int new_element) {
		this.val = new_element;
	}
	
	
	MyList(int[] numeri) {
		for(int i = 0; i < numeri.length; i++) {
			this.insert(numeri[i]);
		}
	}
	
	
	public void insert(int n) {
		if (this.val == null) {
			this.val = n;
			return;
		}
		
		while (this.next!=null) {
			this.next.insert(n);
			return;
		}
		
		MyList newnode = new MyList(n);
		newnode.prev = this;
		this.next = newnode;
	}
	
	public void insert(int index, int newval) {
		
		while (this.next != null) {
			
			if (pos_in == index) {
				//shift
				MyList newnode = new MyList(newval);
				
				MyList leftcopy = this.prev;
				leftcopy.next = null;
				this.prev = newnode;
				newnode.next = this;
				newnode.prev = leftcopy;
				leftcopy.next = newnode;
				break;
			}
			pos_in++;
			next.insert(index, newval);
			break;
		}
		pos_in = 0;
		return;
	}
	
	public void print() {
		if (this.prev == null) {
			System.out.print("[");
		}
		while (this.next!= null) {
			System.out.print(val + ", ");
			this.next.print();
			break;
		}
		if (this.next == null) {
			System.out.print(this.val);
			System.out.println("]");
		}
	}
	
	
}

