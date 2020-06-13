
public class LinkedDeque<E> implements Deque<Object> {
	
	private static class DNode<E> {

		private E data;
		private DNode<E> previous;
		private DNode<E> next;

		
		public DNode(E data, DNode<E> previous, DNode<E> next) {
			this.data = data;
			this.previous = previous;
			this.next = next;
		}
		
		public DNode(E data) {
			this.data=data;
			
		}
		public DNode() {
			this(null,null,null);
		}
		
		public E getData() {
			return data;
		}
		public DNode<E> getPrevious() {
			return previous;
		}
		public DNode<E> getNext() {
			return next;
		}
		/*
		 *public DNode<E> getHead() {
			return head;
		}
		public DNode<E> getTail() {
			return tail;
		} 
		 */
	}
	


	
	public DNode<E> head;
	public DNode<E> tail;

	public LinkedDeque() {
		DNode<E> head = new DNode<E>();
		DNode<E> tail = new DNode<E>();
		tail.previous=head;
		head.next=tail;
		
	}


	public void addFirst(Object element) {
		if(this.head==null) {
			DNode test = new DNode(element);
			this.head.next=test;
			test.previous=head;

		}	
	}
	
	


	public Object removeFirst() {
		if(this.head.next==null) {
			return null;
		}
		Object output =this.head.next.data;
		this.head.next=this.head.next.next;
		this.head.next.previous=null;
		return output;
	}

	public Object getFirst() {
		
		if(this.head.next!=null) {
			return this.head.next.getData();	
		}
		return null;
	}

	public boolean removeFirstOccurrence(Object obj) {
		if(this.head== null) {
			return false;
		}
		DNode<E> look = this.head.next;
		while(look.next!=tail) {
			//edge case look=head
			if(look.data==obj && look==this.head.next) {
				this.head.next.previous=null;
				this.head=this.head.next;
				return true;
			}
			if(look.data==obj) {
				look.previous.next=look.next;
				look.next.previous=look.previous;
				return true;
			}
		look=look.next;
		}
		return false;
	}

	public void addLast(Object element) {
		DNode test1 = new DNode(element);
		
		this.tail.next=test1;
		
	
	}




	


	public Object removeLast() {
		if(this.tail!=null) {
			Object output =this.tail.data;
			this.tail=this.tail.previous;
			this.tail.next=null;
			return output;
		}
		return null;
	
	}

	public Object getLast() {
		
		return this.tail.data;
	}

	public boolean removeLastOccurrence(Object obj) {
		
		if(this.head == null) {
			return false;
		}
		
		DNode<E> look = this.tail;
		
		while(look.previous!=head) {
			
			if(look.data==obj && look==this.tail) {
				this.tail=this.tail.previous;
				this.tail.next=null;
				return true;
			}
			if(look.data==obj) {
				look.previous.next=look.next;
				look.next.previous=look.previous;
				return true;
			}
		look=look.previous;
		}
		return false;
	}

	

	}	

