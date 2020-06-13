import java.util.NoSuchElementException;

public class LinkedLab08<E> {

    private static class Node<E> {
        
        private E data;
        private Node<E> next;
        
        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
        
        public Node(E data) {
            this(data, null);
        }
        
        public Node() {
            this(null, null);
        }
    }
    
    private Node<E> head;
    private Node<E> tail;
    private int size;
    
    public LinkedLab08() {
        head = new Node<>();
        tail = head;
        size = 0;
    }
    
    public int size() {
        return size;
    }
    
    private Node<E> getNodeBefore(int index) {
        Node<E> current = head;
        for (int i=0; i<index; i++)
            current = current.next;
        return current;
    }

	public boolean contains(Object obj) {
	    Node<E> current = head.next;
	    while (current != null) {
	        if (current.data.equals(obj))
	            return true;
	        current = current.next;
	    }
	    return false;
	}
    
    public int indexOf(Object obj) {
        Node<E> current = head.next;
        int index = 0;
        while (current != null) {
            if (current.data.equals(obj))
                return index;
            current = current.next;
            index++;
        }
        throw new NoSuchElementException();
    }
    
    public E get(int index) {
	    if (index < 0 || index >= size)
	        throw new IndexOutOfBoundsException("index: " + index);
        return getNodeBefore(index).next.data;
    }

	public void add(E element) {
	    tail.next = new Node<>(element);
	    tail = tail.next;
	    size++;
	}

	public void add(int index, E element) {
	    if (index < 0 || index > size)
	        throw new IndexOutOfBoundsException("index: " + index);
	    Node<E> previous = getNodeBefore(index);
	    Node<E> current = new Node<>(element, previous.next);
	    previous.next = current;
	    if (tail == previous)
	        tail = current;
	    size++;
	}

	public void remove(int index) {
	    if (index < 0 || index >= size)
	        throw new IndexOutOfBoundsException("index: " + index);
	    Node<E> previous = getNodeBefore(index);
	    previous.next = previous.next.next;
	    if (previous.next == null)
	        tail = previous;
	    size--;
	}

	public void set(int index, E element) {
	    if (index < 0 || index >= size)
	        throw new IndexOutOfBoundsException("index: " + index);
	    getNodeBefore(index).next.data = element;
	}
	
	public void clear() {
	    head.next = null;
	    tail = head;
	    size = 0;
	}
	
	public boolean isEmpty() {
	    return size == 0;
	}
	//think working
	public void moveFirstToLast() {
	    //TO DO: fill in the body of this method
		if (size == 0 ) {
			//System.out.println("movefirsttolast: had size 0");
			throw new NoSuchElementException("List is empty");
		}
		if(size==1) {
			//nothing to be done
			//System.out.println("movefirsttolast: had size 1");
			return;
		}
		
		tail.next = head.next;//good
		head.next = head.next.next; //
		tail = tail.next;
		tail.next = null;
		return;

	}
	//think working
	public void moveLastToFirst() {
	    //TO DO: fill in the body of this method
		if (size == 0 ) {
			//System.out.println("movelast2first: had size 0");
			throw new NoSuchElementException("List is empty");
		}
		if(size==1) {
			//nothing to be done
			//System.out.println("movelast2first: had size 1");
			return;
		}
		
		//error here
		//Node<E> temppriortail = getNodeBefore(indexOf(tail.data));
		//System.out.println(size());
		//System.out.println(getNodeBefore(2));

		//System.out.println(getNodeBefore( size() ).data);
		//tail = temppriortail;
		tail.next = head.next;
		head.next = tail;
		tail = getNodeBefore(size());
		tail.next = null;
		//getNodeBefore(size()).next = null;
	//System.out.println(getNodeBefore(indexOf(tail.data)).data);
		//tail = temppriortail;
		//tail.next =null;
		//tail = getNodeBefore(indexOf(tail.data)).next.next;
		//tail.next = null;
		
		
		
		return;
		
		
		
	}
	
	public void swap(int i, int j) {
	    /*
		
		//TO DO: fill in the body of this method
		//if it deals with head or tail
		if(i>size()|| i <0||j>size()|| j <0 ) {
			throw new IndexOutOfBoundsException("Index:" + i + j);
			
		}
		if(i==j) {
			return;
		}
		if (i>j) {
			int holder = i;
			i = j;
			j=holder;
		}
		if (i == 0 || j == size()) {
			System.out.print("j==size who would have thought");
			//special head and tail modified case
			
		}
		else {
			
		/*
			Node<E> temp_i = getNodeBefore(i).next;
			
			Node<E> temp_j = getNodeBefore(j).next;
			Node<E> prior_temp_j = getNodeBefore(j).next;
			temp_j.next.next= temp_i.next.next;
			getNodeBefore(i).next = temp_j.next;
			prior_temp_j.next = temp_i.next;
			temp_i.next ;
			return;
			
			
		
		}
*/
	}
	
	public void reverse() {
	    //TO DO: fill in the body of this method
	}
	
	@Override
	public String toString() {
	    if (size == 0) return "[ ]";
	    StringBuilder sb = new StringBuilder("[");
	    Node<E> current = head.next;
	    while (current != null) {
	        sb.append(current.data.toString() + ", ");
	        current = current.next;
	    }
	    sb.setLength(sb.length() - 2);
	    sb.append("]\t");
	    return sb.toString();
	}
}