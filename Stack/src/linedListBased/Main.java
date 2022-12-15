package linedListBased;

public class Main {
	public static void main(String[] args) {
		LinkedStack a = new LinkedStack();
		a.push(11);
		a.push(67);
		a.push(22);
		a.push(18);
		a.push(15);
		System.out.println("a:");
		a.outputLinkedStack();
		System.out.println("top of the a : " + a.top());
		a.pop();
		System.out.println("a:");
		a.outputLinkedStack();
		System.out.println("top of the a : " + a.top());
	}

}
