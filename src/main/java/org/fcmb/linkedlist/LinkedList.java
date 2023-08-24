package org.fcmb.linkedlist;

public class LinkedList {
	Node head;

	public void insert(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;

		if(head == null){
			head = node;
		}else{
			Node n = head;
			while(n.next != null)
			{
				n = n.next;
			}
			n.next = node;
		}
	}

	public void insertAtFirst(int data)
	{
		Node node = new Node();
		node.data = data;

		node.next = head;
		head = node;
	}

	public void insertAt(int index, int data){
		if(index == 0){
			insertAtFirst(data);
		}else{

		Node node = new Node();
		node.data = data;

		Node n = head;

		for(int i=1; i<index; i++)
		{
			n = n.next;
		}
		node.next = n.next;
		n.next = node;

		}

	}

	public void deleteAt(int index)
	{
		if(index == 0)
		{
			Node node = head;
			head = node.next;
			node = null;
		}else
		{
			Node n = head;

			for(int i=1; i<index; i++)
			{
				n = n.next;
			}

			Node n1 = n.next;
			n.next = n1.next;
			n1 = null;
		}
	}
	public void display()
	{
		Node node = head;
		System.out.print("[ ");
		while(node.next != null)
		{
			System.out.print(node.data +", ");
			node = node.next;
		}
		System.out.print(node.data +" ]");
	}
}
