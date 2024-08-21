package dsa;

public class LList {
	static Node head;
	static class Node{
		Node next;
		String data;
		
		public Node(String data) {
			this.data = data;
			this.next = null;
		}
	}
		
		public static void addFirst(String data) {
			Node newNode = new Node(data);
			if(head == null) {
				head = newNode;
				return;
			}
			newNode.next = head;
			head = newNode;	
		}
		
		public static void printList() {
			if(head == null) return;
			
			Node currNode = head;
			while(currNode != null){
				System.out.print(currNode.data +"=> ");
				currNode = currNode.next;
			}
			System.out.println();	
		}
		
		public static void  addLast(String data) {
			Node newNode = new Node(data);
			if(head == null) {
				head = newNode;
				return;
			}
			Node currNode = head;
			while(currNode.next != null) {
				currNode = currNode.next;
			}
			currNode.next = newNode;
		}
		
		public static void deleteFirst() {
			if(head == null) return;
			head = head.next;
		}
		
		public static void deleteLast() {
			if(head == null) return;
			if(head.next == null) return;
			
			Node second = head;
			Node last = head.next;
			while(last.next != null) {
				last = last.next;
				second = second.next;
			}
			second.next = null;
		}
		
		
		public void reverseIterate() {
			if(head == null || head.next == null) return;
			 Node prevNode = head;
			 Node currNode = head.next;
			 while(currNode != null) {
				 Node nextNode = currNode.next;
				 currNode.next = prevNode;
				 
				 //update
				 prevNode = currNode;
				 currNode = nextNode;
			 }
			 
			 head.next = null;
			 head = prevNode;
			
		}
		
		public Node reverseRec(Node head) {
			if(head == null || head.next == null) return head;
			Node newHead = reverseRec(head.next);
			head.next.next = head;
			head.next = null;
			return newHead;
		}
		
		 public boolean search(Node head, String element)
		    {
		        Node currNode = head; // Initialize current
		        while (currNode != null) {
		            if (currNode.data == element)
		                return true; // data found
		            currNode = currNode.next;
		        }
		        return false; // data not found
		    }
		 
		   public boolean searchRec(Node head, String x)
		    {
		        // Base case
		        if (head == null)
		            return false;
		 
		        // If key is present in current node,
		        // return true
		        if (head.data == x)
		            return true;
		 
		        // Recur for remaining list
		        return searchRec(head.next, x);
		    }

		
		
//		public static void insert(String data,int pos) {
//			int size = size();
//			if(pos <0 || pos > size) {
//				throw Exception("");
//				
//			}
//			if(pos == 0) addFirst(data);
//			else if(pos > size) addLast(data);
//			else {
//				Node newNode = new Node(data);
//				Node currNode = head;
//				for(int i=0; i<pos-1;i++) {
//					currNode = currNode.next;
//				}
//				newNode.next =currNode.next;
//				currNode.next = newNode;
//			}
//		}

	
	public static void main(String[] args) {
		 LList ll = new LList();
		 ll.addFirst("sandip");
		 ll.addFirst("Prabina");
		 ll.addFirst("Move");
		 ll.printList();
		 
//		 ll.addLast("Srijana");
//		 ll.addLast("Mobek");
//		 ll.printList();
		 
//		 ll.deleteFirst();
//		 ll.printList();
//		 
//		 ll.deleteLast();
//		 ll.printList();
	}


}
