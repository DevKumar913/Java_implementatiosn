package com.kumar.leetcode_Easy;

public class Merge_2_SortedLinkedList {
	class Node{
		int value;
		Node next;
		Node(){
			
		}
		Node(int value){
			this.value=value;
		}
		
		Node(int value, Node next){
			this.value=value;
			this.next=next;
		}
	}
	
	public Node mergeSortedArrays(Node firstListNode, Node secondListNode) {
		
		Node dummy = new Node();
		Node current= dummy;
		
		while(firstListNode!=null && secondListNode!=null ) {
			
			if(firstListNode.value>secondListNode.value) {
				current.next=secondListNode;
				secondListNode=secondListNode.next;
			}
			else {
				current.next=firstListNode;
				firstListNode=firstListNode.next;
			}
			
			current=current.next;
		}
		current.next=(firstListNode!=null)?firstListNode: secondListNode;
		
		return dummy.next;
		
	}
	public void printList(Node node) {
		while (node != null) {
			System.out.print(node.value + " -> ");
			node = node.next;
		}
		System.out.println("null");
	}
	
	public static void main(String args[]) {
		Merge_2_SortedLinkedList obj = new Merge_2_SortedLinkedList();
		Node firstListNode = obj.new Node(1);
		firstListNode.next = obj.new Node(3);
		firstListNode.next.next = obj.new Node(5);
		
		
		Node secondListNode = obj.new Node(2);
		secondListNode.next=obj.new Node(4);
		secondListNode.next.next= obj.new Node(6);
		Node headOfMergedList = obj.mergeSortedArrays(firstListNode,secondListNode);
		System.out.println("The head of the Merged Node is "+ headOfMergedList.value);
		obj.printList(headOfMergedList);
		
		
	}

}
