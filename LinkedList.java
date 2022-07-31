public class LinkedList{
	
	Node head;
	class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data = data;
			this.next = null;
		}
	}
	
	
	// two ways of ADDING elements in linked list 1. First and 2. Last
	
	
	// 1. Add - First
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	
	
	// 2. Add - Last
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node currentNode = head;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		
		currentNode.next = newNode;
	}
	
		// Printing the list
		public void printList() {
			if(head == null) {
				System.out.print("List is Empty");
				return;
			}
			
			Node currentNode = head;
			while(currentNode != null) {
				System.out.print(currentNode.data + " -> ");
				currentNode = currentNode.next;
			}
			
			System.out.print("NUll");
		}
	
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.addFirst("akshay");
		list.addLast("Vishwakarma");
		list.printList();
		
	}
}
