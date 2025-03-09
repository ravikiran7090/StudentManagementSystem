package StringProgram;

public class LinkedListRunnner {

	public static void main(String[] args) {
		Node head=new Node(10);
	 head.next=new Node(20);
	 head.next.next=new Node(30);
	 traverseLinkedList(head);
	 traverseLinkedList( revesreLinkedList(head));

	}
	public static void traverseLinkedList(Node head) {
		System.out.println();
		Node current=head;
		while(current!=null) {
			System.out.print(current.getData()+" ");
			current=current.next;
		}
	}
	public static Node revesreLinkedList(Node head) {
		Node current=head;
		Node previous=null;
		Node next=null;
		while(current!=null) {
			next=current.next;
			current.next=previous;
			previous=current;
			current=next;
		}
		return previous;
	}
	

}
