class queue{
	public void main (String srt[]){
		Q q=new Q();

		q.add(5);
	}
}
class Q{
	Node head,tail;
	public void add(int val){
		Node t=new Node(val);
		if(tail==null){
			head=tail=t;
		}else{
			tail.next=t;
		}
		tail=tail.next
	}



	class Node{
		int value;
		Node next;
		Node(int v){
			value=v;
		}
	}
}
