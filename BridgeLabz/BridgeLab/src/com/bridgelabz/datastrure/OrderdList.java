package com.bridgelabz.datastrure;

/**
 * @author Rahul C H
 *
 */
public class OrderdList<T extends Comparable<T>> {
 Node head ; 
Node tail;
 @SuppressWarnings("unchecked")
public void add(T data) {
	 Node n = head; 
	 Node temp = new Node(data);
	 if(head == null) {
		 head  = temp;
		 head.next=tail;
		 tail = head;
		 
	 }else if(data.compareTo((T) head.data)<0) {
		 temp.next = head;
		 head = temp;
		
	 }
	 else {
		 if (data.compareTo((T) tail.data) > 0) {
				tail.next = temp;
				tail = temp;
				return;
			}
	 Node prev =  null; 
		while (data.compareTo((T) n.data) > 0 && n.next != null) {
			prev = n;
			n = n.next;
		}
		prev.next = temp;
		temp.next = n;
 }
 }

 public void remove(T item) {
		Node n = head;
		Node prev = null;
		if (head.data.equals(item)) {
			head = head.next;

			return;
		} else if (tail.data.equals(item)) {
			while (!n.next.data.equals(tail.data)) {
				n = n.next;
			}
			n.next = null;
			tail = n;
			return;
		} else {
			while (!n.data.equals(item)) {
				prev = n;
				n = n.next;
			}
			n = n.next;
			prev.next = n;
			n = null;
		
		}
	}

 
 public void disp() {
	 Node temp = head;
	 while(temp!= null) {
		 System.out.println(temp.data);
		 temp = temp.next;
	
	 }
 }
 
public boolean search(T item) {
		Node n = head;
		while (n != null) {
			if (n.data.equals(item)) {
				return true;
			}
			n = n.next;
		}
		return false;
	}

	/**
	 * function to check if the list is empty or not
	 * 
	 * @return true if empty and false if not empty
	 */
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}
	
	/**
	 * Function to return the index of the item assuming it is present
	 * 
	 * @param item the item to return the index of
	 * @return the index of the passed item
	 */
	public int index(T item) {
		int index = 0;
		Node n = head;
		while (!n.data.equals(item)) {
			n = n.next;
			index++;
		}
		return index;

	}

	/**
	 * function to remove the item from the last of list and return it
	 * 
	 * @return the last element of list after removing
	 */
	@SuppressWarnings("unchecked")
	public T pop() {
		Node n = head;
		Node prev = null;
		while (n.next != null) {
			prev = n;
			n = n.next;
		}
		prev.next = null;
		tail = prev;
			return (T) n.data;
	}

	/**
	 * Function to return the element at the given position
	 * 
	 * @param pos the index at which the item to return
	 * @return the element at the given index after removing it
	 */
	@SuppressWarnings("unchecked")
	public T pop(int pos) {
		int index = 0;
		Node prev = null;
		Node n = head;
		if (pos == 0) {
			head = head.next;
			return (T) n.data;
		} else {
			while (index != pos) {
				prev = n;
				n = n.next;
				index++;
			}
			prev.next = n.next;
		
			return (T) n.data;
		}
	}
 
 public static void main(String[] args) {
	 OrderdList<Integer> or =new OrderdList<Integer>();
	 or.add(78);
or.add(43);
or.add(65);
or.remove(43);
or.add(95);
or.add(105);
	or.disp();
 }
 
}
