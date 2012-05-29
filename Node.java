package node;

public class Node {
	int label;
	Node next;
	
	public Node (int label){
		this.label = label;
		this.next = null;
	}
	
	public static Node createList(int[] arr){
		if (arr.length == 0){
			return null;
		}
		Node curr = new Node(arr[0]);
		Node head = curr;
		for(int i = 1; i < arr.length; i++){
			Node n = new Node(arr[i]);
			curr.next = n;
			curr = n;
		}
		return head;
	}
	
	public static Node reverseList(Node head){
		if (head == null){
			return null;
		}
		Node curr = head;
		Node before = null;
		Node after = curr.next;
		while(after != null){
			curr.next = before;
			before = curr;
			curr = after;
			after = after.next;
		}
		curr.next = before;
		return curr;
	}
	
	public static String getVals(Node head){
		String str = "";
		while(head != null){
			str += head.label;
			if(head.next != null){
				str += " ";
			}
			head = head.next;
		}
		return str;
	}
	
	public static void main (String[] args){
		int[] array = {1,2,3,4,5,6};
		Node list = createList(array);
		String list_now = getVals(list);
		System.out.println(list_now);
		Node rlist = reverseList(list);
		list_now = getVals(rlist);
		System.out.println(list_now);
		
	}
}
