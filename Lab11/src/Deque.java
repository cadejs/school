
public interface Deque<E> {
	public void addFirst (E element ) ;
	public E removeFirst();
	public E getFirst();
	public boolean removeFirstOccurrence( Object obj ) ;
	public void addLast (E element );
	public E removeLast ( ) ;
	public E getLast ( ) ;
	public boolean removeLastOccurrence ( Object obj ) ;
	
}
