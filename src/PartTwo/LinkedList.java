package PartTwo;
//import List.Set;
//import List.node;

<<<<<<< HEAD
class LinkedList<E> {
	Object item;
    LinkedList<E> next;
//	private Set inputSet;
	

    @SuppressWarnings("null")
	LinkedList() 
	{
      item = (Object) null;
      next = null;
      
    }

    LinkedList(Object item) {
      this.item = item;
      next = null;
    }

    LinkedList(Object item, LinkedList<E> next) {
      this.item = item;
      this.next = next;
    }

    LinkedList(LinkedList<E> n) {
      this.item = n.item;
      this.next = n.next;
=======
import List.Node;

public class LinkedList<E> {
    private Node<E> head;
    private int size;
    //private Node tail;

    LinkedList() {
      head = null;
      size = 0;
    }
    
    public int getSize() {
    	return size;
    }

    public E get(int index) {
        return null;
    }
    
    private Node<E> find(int position) {
    	int count = 0;
        for (Node<E> curr = head; curr != null; curr = curr.next) {
            if (count == position) {
            	return curr;
            }
            count++;
        }
        return null;
    }
    
    public E remove(int position) throws IndexOutOfBoundsException {
    	Node<E> deleted = null;
    	if (position < 0 || position >= size ) {
    		throw new IndexOutOfBoundsException("Your position " + position + " is not correct");
    	}
    	else if (position == size - 1) {
    		Node<E> prev = find(position - 1);
    		deleted = prev.next;
    		prev.next = null;
    	}
    	else if (position == 0) {
    		Node<E> first = head;
    		deleted = head;
    		head = first.next;
    		first.next = null;
    	}
    	else {
    		Node<E> prev = find(position - 1);
    		Node<E> curr = prev.next;
    		deleted = prev.next;
    		prev.next = curr.next;
    		curr.next = null;
    	}
    	size--;
    	return deleted.item;
    }
    
    public void add(E input, int position) throws IndexOutOfBoundsException {
    	if (position < 0 || position > size ) {
    		throw new IndexOutOfBoundsException("Your position " + position + " is not correct");
    	}
    	else if (position == 0) {
    		Node<E> first = head;
    		Node<E> newNode = new Node<E>(input);
    		head = newNode;
    		newNode.next = first;
    	}
    	else if (position == size) {
    		add(input);
    		return;
    	}
    	else {
    		Node<E> prev = find(position - 1);
    		Node<E> newNode = new Node<E>(input);
    		Node<E> curr = prev.next;
    		prev.next = newNode;
    		newNode.next = curr;
    	}
    	size++;
    }

    public void add(E input) {
    	size++;
    	Node<E> newNode = new Node<E>(input);
    	Node<E> curr = head;
    	if (head == null) {
    		head = newNode;
    		return;
    	}
        while (curr.next != null) { // while not end
          curr = curr.next;
        }
        curr.next = newNode;
>>>>>>> ac3695f0bcff5f992857aa7b68c78dc0905358c4
    }
    
    void addItem(LinkedList<E> a) {
    	this.item = a.item;
    	this.next = a.next;
    }

<<<<<<< HEAD
//	node(Set inputSet) 
//	{
//		this.inputSet = inputSet;
//		
//	}
=======
    public void display() {
        for (Node<E> curr = head; curr != null; curr = curr.next) {
            System.out.print(curr.item + ", ");
        }
        System.out.println("");
    }
>>>>>>> ac3695f0bcff5f992857aa7b68c78dc0905358c4
}
