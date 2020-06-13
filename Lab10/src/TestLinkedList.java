
public class TestLinkedList<E> {
	
	private static class Node<E>{
		private E data;
		private Node<E> next;
	
	private Node(E data, Node<E> next) {
		this.data = data;
		this.next = next;
	}
		
		private Node(E data) {
		this(data,null);
	}
	private Node() {
		this(null,null);
		
	}
	}
	
	private Node<E> head;
	private Node<E> tail;
	
	public TestLinkedList() {
		
		head = new Node<>();
		tail = head;
	}
	
	public void add(E item) {
		head.next = new Node<>(item,head.next);
		if (head==tail) tail= head.next;
	}
	
	public int recursivesize(Node<E> node) {

		if (node == null) {
			return 0;
		}
		if(node.next==null) {
			return 1;
		}
		
		return 1+recursivesize(node.next);
	}
	
	public int size() {

		return recursivesize(head.next);

	}
	
public void concat(TestLinkedList<E> list2) {
	
	this.tail.next=list2.head.next;
	
}
	
@Override
public String toString() {
	if (head==tail) return "[]";
	StringBuilder sb = new StringBuilder("[");
	Node current = head.next;
	while (current.next !=null) {
		sb.append(current.data + ", ");
		current = current.next;
	}
	sb.append(current.data + "]\n");
	return sb.toString();
}


public static void main(String[] args) {
	
	TestLinkedList<String> listA = new TestLinkedList <>(); 
	TestLinkedList<String> listB = new TestLinkedList <>();  

 	
System.out.println("Sizeof List A:"+listA.size()); 
System.out.println("List A: "+listA);
 listA.add("two "); 
 listA.add("one");
 System.out.println(" Size of List A: " + listA.size());
 
 System.out.println(" List A: " + listA ); 
 listB.add(" six ");
 listB.add(" five "); 
 listB.add(" four "); 
System.out.println(" Size of List B:" + listB.size());

 System.out.println (" List B: " + listB);
 listA.concat(listB); 
System . out . println (" Size of concatenated lists : " + listA.size()); 
System . out . println ("Concatenated lists : " + listA); 
System . out . println (" Size of List B: " + listB.size()); 
System . out . println (" List B: " + listB);
} 

}
