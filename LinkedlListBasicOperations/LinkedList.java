
public class LinkedList {
	Node head;
		
	//Add first element into the list

	public void addElementAtStart(String data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;	
	}
	//AddLastElement
	public void addElementAtEnd(String data) {
		Node newNode=new Node(data);

		if(head==null) {
			head=newNode;
			return;
		}

		Node currentNode=head;

		while(currentNode.next !=null) {
			currentNode=currentNode.next;
		}
		currentNode.next=newNode;
	}

	//PrintElement

	public void printList() {
		if(head==null) {
			System.out.println("Empty list");
			return;
		}
		Node currentNode=head;

		while(currentNode !=null) {
			System.out.print(currentNode.data + "->");
			currentNode=currentNode.next;
		}
		System.out.println("NULL");
	}


	//DeleteList

	public void deleteFirstElement() {

		if(head==null) {
			System.out.println("Head is empty:");
			return;
		}
		head=head.next;
	}

	public void deleteLastElement() {
		if(head==null) {
			System.out.println("Head is empty:");
			return;
		}

		if(head.next==null) {
			head=null;
			return;
		}

		Node secondLast=head;
		Node lastNode=head.next;

		while(head.next!=null) {
			lastNode=lastNode.next;
			secondLast=secondLast.next;
		}
		secondLast=null;
	}
	
	public void listSize() {
		int size=0;
		while(head !=null) {
			size++;
			head=head.next;
		}
		System.out.println(size);
	}
	
	public void reverseAList() {
		if(head==null || head.next == null) {
			return;
		}
		
		Node previousNode=head;
		Node currentNode=head.next;
		
		while(currentNode !=null) {
			Node nextNode = currentNode.next;
			currentNode.next= previousNode;
			
			currentNode=previousNode;
			nextNode=currentNode;
		}
		
		head.next=null;
		head=previousNode;
	}

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.addElementAtStart("Rutuja");
		ll.printList();
		ll.addElementAtStart("Rutu");
		ll.printList();

		ll.addElementAtEnd("Rut");
		ll.printList();

		ll.listSize();
		
		ll.reverseAList();
		ll.printList();

	}
}
