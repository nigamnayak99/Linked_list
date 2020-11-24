package linked_list_practice;
import java.util.*;

public class LinkedListUse {
	
	public static Node<Integer> takeInput() {
		Node<Integer> head = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		while(data !=  -1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null) {
				head = newNode;
			}
			else {
				Node<Integer> temp = head;
				while(temp.next != null) {
					temp = temp.next;
					}
				temp.next = newNode;
				}
			data = s.nextInt();
		}
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter elements of LinkedList until -1");
		Node<Integer> head = takeInput();
		System.out.println("The head is :" +head.data);
		

	}

}
