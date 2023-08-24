package org.fcmb.linkedlist;

public class Run {
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();

		list.insert(5);
		list.insert(15);
		list.insert(32);
		list.insertAtFirst(35);
		list.insertAtFirst(20);
		list.insertAt(3, 11);
		list.insertAt(0, 5);
		list.deleteAt(5);

		list.display();
	}
}
