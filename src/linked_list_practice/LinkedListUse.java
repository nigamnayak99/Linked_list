package linked_list_practice;
import java.util.*;

public class LinkedListUse {
	
	
	
	
	/*this function takes input as node data 
	 * until user puts -1
	 * */
	public static Node<Integer> takeInput() {
		Node<Integer> head = null;//answer is null at first
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();// taking first number
		while(data !=  -1) {//while data is not -1
			Node<Integer> newNode = new Node<Integer>(data);//create a newNode with given data
			if(head == null) {//if head is null then it will be first element in ll
				head = newNode;//so head will be new node and its next reference is automaticallu null
			}
			else {
				//in case it is not the first data in ll
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
	
	
	
	//Count Length Function
	public static int countLength(Node<Integer> head) {
		int counter = 0;
		while(head.next != null) {
			counter = counter + 1;
		}
		return counter;
	}
	
	
	
	//Print Function
	public static void print(Node<Integer> head) {
		//saving the head reverence in temp
		Node<Integer> temp = head;
		//print the data until we face null as head data
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	
	//-----------MAIN function------------------
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter elements of LinkedList until -1");
		Node<Integer> head = takeInput();
		System.out.println("Data is ");
		print(head);
		int c =countLength(head);
		System.out.println("length is :"+c);
		}
}




