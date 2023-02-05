// Name: Parth Patel
// Class: CS 3305/Section #01
// Term: Spring 2023
// Instructor: Dr. Haddad
// Assignment:  3
// IDE Name: <IntelliJ>

import java.util.Scanner;

public class myTest
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		LinkedList myList = new LinkedList(); //create a list object

		int choice;

		do {
			System.out.println("\n---------MAIN MENU--------\n1 - Add First Node\n2 - Add Last Node\n3 - Add At Index");
			System.out.println("4 - Remove First Node\n5 - Remove Last Node\n6 - Remove At Index");
			System.out.println("7 – Print List Size\n8 – Print List (Forward)\n9 – Print List In Reverse\n10 - Exit Program");
			System.out.println("\nEnter option number: ");
			choice = sc.nextInt();

			switch (choice){
				case 1: System.out.println("Testing method addFirstNode(), Enter data to add:");
						int d = sc.nextInt();
						System.out.print("List before adding first node: " );
						myList.printList(); //Prints old list, then updates the list, then print updated version
						myList.addFirstNode(d);
						System.out.print("\nList after adding first node: ");
						myList.printList();
					break;

				case 2: System.out.println("Testing method addLastNode(), Enter data to add:");
						int a = sc.nextInt();
						System.out.print("List before adding last node: " );
						myList.printList();
						myList.addLastNode(a);
						System.out.print("\nList after adding last node: ");
						myList.printList();
					break;

				case 3: System.out.println("Testing method addAtIndex(), Enter index :");
					int a1 = sc.nextInt();
					if (a1 < 0 || a1 > myList.countNodes()){ //check if index is valid
						System.out.println("Invalid index, try again.");
						break;
					}
					System.out.println("Enter data to add: ");
					int d1 = sc.nextInt();
					System.out.print("List before adding at index node: " );
					myList.printList();
					myList.addAtIndex(a1,d1);
					System.out.print("\nList after adding at index node: ");
					myList.printList();
					break;

				case 4: if (myList.head == null){ // checking if list is empty
						System.out.println("List is empty, try again.");
						break;
					}
					System.out.println("Testing method removeFirstNode().");
					System.out.print("List before removing first node: " );
					myList.printList();
					myList.removeFirstNode();
					System.out.print("\nList after removing first node: ");
					myList.printList();
					break;

				case 5: if (myList.head == null){ // checking if list is empty
						System.out.println("List is empty, try again.");
						break;
					}
					System.out.println("Testing method removeLastNode().");
					System.out.print("List before removing last node: " );
					myList.printList();
					myList.removeLastNode();
					System.out.print("\nList after removing last node: ");
					myList.printList();
					break;

				case 6:  System.out.println("Testing method removeAtIndex(), Enter index :");
					int a3 = sc.nextInt();
					if (a3 < 0 || a3 > myList.countNodes()){ //check if index is valid
						System.out.println("Invalid index, try again.");
						break;
					}
					System.out.print("List before adding at index node: ");
					myList.printList();
					myList.removeAtIndex(a3);
					System.out.print("\nList after adding at index node: ");
					myList.printList();
					break;

				case 7: System.out.print("Testing method countNodes(): ");
					System.out.println("\nList sizes is "+myList.countNodes() + " nodes");
					break;

				case 8: System.out.println("Testing method printList(): ");
					myList.printList();
					break;

				case 9: System.out.println("Testing method printInReverse(): ");
					System.out.print("List before reversing: ");
					myList.printList();
					System.out.print("\nList after reversing: ");
					myList.printInReverse(myList.head);
					break;
			}
		} while (choice != 10);

	}
}


