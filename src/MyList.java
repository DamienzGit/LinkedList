public class MyList {
	
	Integer val;
	
	private MyList prev;
	private MyList next;
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
	
	MyList(MyList newlist) {
		this.val = newlist.val;
		this.prev = newlist.prev;
		this.next = newlist.next;
		pos_in = 0;
		pos_re = 0;
	}
	
	// funziona
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
	
	
	// funziona
	public void insert(int index, int newval) throws InvalidPositionException {
		if (index < 0 ) throw new InvalidPositionException();
		
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
				pos_in = 0;
				return;
			}
			else {
				pos_in++;
				next.insert(index, newval);
				return;
			}
		}
		if (index > pos_in) throw new InvalidPositionException();
		pos_in = 0;
		return;
	}
	
	// funziona
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
	
	private int pop() {
		System.out.print("ora la lista è ");
		this.print();
		while(this.next != null) {
			return this.next.pop();
		}
		int revalue = this.val;
		this.prev.next = null;
		return revalue;
		
	}
	
	public void remove(int index) {
		
		while (this.next != null) {
			if (pos_re == index) {
				this.prev.next = this.next;
				this.next.prev = this.prev;
				pos_re = 0;
				return;
			} else {
				pos_re++;
				this.next.remove(index);
				return;
			}
			
		}
	
	}
	
	public MyList concat(MyList newlist) {
		while (this.next!=null) {
			this.next.concat(newlist);
			break;
		}
		MyList obj = new MyList(newlist);
		MyList mine = this;
		mine.next = obj;
		obj.prev = mine;
		return mine;
	}
	
	public void clear() {
		this.next   = null;
		this.prev   = null;
		this.val    = null;
		pos_in 		= 0;
		pos_re 		= 0;
	}
	
	public void reverse_inplace() {
	
	}
	
	public MyList reverse_new() {
		MyList thiscopy = this;
		MyList obj = new MyList();
		while (thiscopy.next != null) {
			obj.insert(thiscopy.pop());
		}
		return obj;
	}
}

