
public class Node<E> {

	/**
	 * Declares a head and tail for the node to use
	 */
	private E head, tail;
	
	/**
	 * Constructor setting head and tail to null
	 */
	public Node() {
		head = null;
		tail = null;
	}
	
	/**
	 * Constructor setting head equal to a given value, and tail to null
	 * @param head Input value that sets current Node head to input value
	 */
	public Node(E head) {
		this.head = head;
		tail = null;
	}
	
	public E getHead() {
		return head;
	}
	
	public E getTail() {
		return tail;
	}
	
	public void setTail(E tail) {
		this.tail = tail;
	}
	
	public void setHead(E head) {
		this.head = head;
	}
}
