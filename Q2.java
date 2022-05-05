import java.util.Scanner;

class Q2{
	static Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	
	void display(Node n){
	//	Node n= head;
		while(n!=null){
			System.out.print(n.data+" ");
			n=n.next;
		}
	}
	
	 Node reverse(Node node){
		 Node back =null;
		 Node curr =node;
		 Node next =null;
		 
		 while(curr != null){
			 next=curr.next;
			 curr.next=back;
			 back=curr;
			 curr=next;
			 
		 }
		 node =back;
		 return node;
	}
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Q2 q = new Q2();
		
		q.head = new Node(1);
		/*Node second=new Node(2);
		Node third=new Node(3);
		Node forth=new Node(4);
		Node fifth=new Node(5);
		*/
		int i;
		do{
			System.out.println();
			System.out.println("enter number or enter o to exit");
			 i=sc.nextInt();
			
			switch(i){
				case 1: 
				q.head = new Node(1);
					q.head.next=new Node(2);
					q.head.next.next=new Node(3);
					q.head.next.next.next=new Node(4);
					q.head.next.next.next.next=new Node(5);
				
					
					System.out.println("Given linked list");
					q.display(q.head);
					System.out.println();
					System.out.println("Reverse linked list");
					head=q.reverse(q.head);
					q.display(head);
				break;
				case 2:
				
				q.head = new Node(3);
					q.head.next=new Node(4);
					q.head.next.next=new Node(2);
					q.head.next.next.next=new Node(5);
					
				
					
					System.out.println("Given linked list");
					q.display(q.head);
					System.out.println();
					System.out.println("Reverse linked list");
					head=q.reverse(q.head);
					q.display(head);
				break;
				
				
			}	
		}while(i!=0);
	}
	
}