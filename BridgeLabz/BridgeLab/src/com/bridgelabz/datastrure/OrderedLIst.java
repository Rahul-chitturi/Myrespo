package com.bridgelabz.datastrure;
	
	public class OrderedLIst<T extends Comparable<T>> {
		Node head;
		Node tail;
		int size = 0;

		/**
		 * function to add a new item in the list and returns nothing
		 * 
		 * @param data the item which to be added
		 */
		@SuppressWarnings("unchecked")
		public void add(T data) {

			Node n = head;
			Node temp = new Node(data);
			size++;
			if (head == null) {
				// System.out.println("1st");
				head = temp;
				head.next = tail;
				tail = head;
			} else if (data.compareTo((T) head.data) < 0) {
				// System.out.println("2nd");
				temp.next = head;
				head = temp;
			} else {
				if (data.compareTo((T) tail.data) > 0) {
					tail.next = temp;
					tail = temp;
					return;
				}
				Node prev = null;
				while (data.compareTo((T) n.data) > 0 && n.next != null) {
					prev = n;
					n = n.next;
				}
				prev.next = temp;
				temp.next = n;
			}
		}

		 public void disp() {
			 Node temp = head;
			 while(temp!= null) {
				 System.out.println(temp.data);
				 temp = temp.next;
			 }
		 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OrderedLIst<Integer> li = new OrderedLIst<Integer>();
		li.add(78);
		li.add(43);
		li.add(65);
		li.add(95);
		li.disp();
		
		
	}

}
