package arrayBased;

public class Main {

	public static void main(String[] args) {
		Stack n = new Stack(3);
		n.push(10);
		n.push(11);
		n.push(12);
		n.push(15);
		System.out.println("top : "+ n.top());
		n.outputStack();
		n.pop();
		System.out.println("top : "+ n.top());
		n.outputStack();
		
		Stack s = new Stack(5);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		n.copyStack(s);
		System.out.println("change:");
		s.outputStack();
		Stack y = new Stack(s);
		System.out.println(n.equals(s));
		System.out.println(n.equals(n));
		s.outputStack();
		y.outputStack();
	}
}
