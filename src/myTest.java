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
			System.out.println("---------MAIN MENU--------\n1 - Add First Node\n2 - Add Last Node\n3 - Add At Index");
			System.out.println("4 - Remove First Node\n5 - Remove Last Node\n6 - Remove At Index");
			System.out.println("7 – Print List Size\n8 – Print List (Forward)\n9 – Print List In Reverse\n10 - Exit Program");
			System.out.println("\nEnter option number: ");
			choice = sc.nextInt();

			switch (choice){
				case 1: System.out.println("Testing method addFirstNode(), Enter data to add:");
						int d = sc.nextInt();
						myList.addFirstNode(d);
						System.out.print("List before adding first node: " );

						System.out.println("\nList after adding first node: ");
						myList.printList();
				break;
				case 2:
			}
		} while (choice != 10);

	}
}


