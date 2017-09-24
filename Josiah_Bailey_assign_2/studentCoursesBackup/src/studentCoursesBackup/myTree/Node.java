package node;

import java.util.ArrayList;

public class Node{
	private int bNumber;
	ArrayList<String> courses;
	private Node right;
	private Node left;
	
	Node(int bNum, ArrayList<string> cours){
		bNumber = bNum;
		for(int i = 0; i < cours.size(); i++){
			courses.add(cours.get(i));
		}
		right = null;
		left = null;
	}
	
	public void insertCourse(Node head, int bNum, string course){
		Node node = search(head, bNum);
		if(node == null) return;
		boolean exists = false;
		for(int i = 0; i < node.courses.size(); i++){
			if(node.courses.get(i).equals(course)){
				exists = true;
				break;
			}
		}
		if(!exists) node.courses.add(course);
	}
	
	public void insertNode(Node head, int bNum){
		if(head == null){
			head = new Node(bNum);
			return head;
		}
		
		while(head != null){
			if(bNum > head.getBNumber()){
				head = head.right;
			}
			else if(bNum < head.getBNumber()){
				head = head.left;
			}
		}
		
		head = new Node(bNum);
		
		return head;
	}
	
	public Node search(Node head, int bNum){
		while(head != null){
			if(head.getBNumber() == bNum) return head;
			if(bNum > head.getBNumber()){
				head = head.right;
			}
			else if(bNum < head.getBNumber()){
				head = head.left;
			}
		}
		return null;
	}
	
	public void deleteCourse(Node head, int bNum, string course){
		Node node = search(head, bNum);
		if(node == null) return;
		for(int i = 0; i < node.courses.size(); i++){
			String temp = node.courses.get(i);
			if(temp.equals(course)) node.courses.remove(i);
		}
		
		/*while(head != null){
			if(bNum > head.getBNumber()){
				head = head.right;
			}
			else if(bNum < head.getBNumber()){
				head = head.left;
			}
			else{
				if(head.left == null){
					head = head.right;
					return head;
				}
				else if(head.right == null){
					head = head.left;
					return head;
				}
				head.bNumber = getMin(head.right);
				head.right = delete(head.right, head.getBNumber());
			}
		}
		
		return head;*/
	}
	
	public int getMin(Node head){
		int min = head.bNum;
		while(head.left != null){
			min = head.left.bNumber;
			head = head.left;
		}
		return min;
	}
	
	public int setBNumber(int bNum){
		bNumber = bNum;
	}
	
	public int getBNumber(){
		return bNumber;
	}
}