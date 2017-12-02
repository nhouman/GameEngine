package List;

import List.Set;
import List.node;

class node<E> {
	int item;
    node<E> next;
	private Set inputSet;
	

    @SuppressWarnings("null")
	node() 
	{
      item = (Integer) null;
      next = null;
      
    }

    node(int item) {
      this.item = item;
      next = null;
    }

    node(int item, node<E> next) {
      this.item = item;
      this.next = next;
    }

    node(node<E> n) {
      this.item = n.item;
      this.next = n.next;
    }

	node(Set inputSet) 
	{
		this.inputSet = inputSet;
		
	}
}
