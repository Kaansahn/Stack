package arrayBased;

public class Stack {
	private int[] stackArray;
	private int size;
	private int top;
	
	public Stack(int newSize) {
		if (newSize <= 0) 
			size = 10; //default size
		else
			size = newSize;
		
		stackArray = new int[size];
		top = 0;
	}
	
	public Stack() {
		size = 10; //default size
		stackArray = new int[size];
		top = 0;
	}
	
	public void initializeStack() {
		top = 0; 
		//initializes the stack to an empty state.
		//Because the value of top indicates whether the stack is empty, simply set top to 0 initialize the stack
	}
	
	public boolean isEmpty() {
		return (top == 0);
	}
	
	public boolean isFull() {
		return (top == size);
	}
	
	public boolean push(int newItem) {
		if (!isFull()) {
			stackArray[top] = newItem;
			top++;
			return true;
		}else
			return false;
	}
	
	public boolean pop() {
		if (!isEmpty()) {
			top--;
			return true;
		}else 
			return false;
	}
	
	public int top() {
		assert (top == 0); //terminate the program if the stack is empty
		return stackArray[top - 1];
	}
	
	public void copyStack(Stack newStack) {
		size = newStack.size;
		top = newStack.top;
		stackArray = new int [size];
		for (int i = 0; i < top; i++) {
			stackArray[i] = newStack.stackArray[i];
		}
	}
	
	public Stack(Stack otherStack) {
		copyStack(otherStack);
	}
	
	public boolean equals(Stack otherStack) {
		if (size != otherStack.size) 
			return false;
		else {
			for (int i = 0; i < size; i++) {
				if (stackArray[i] != otherStack.stackArray[i]) 
					return false;
			}
		}
		return true;
	}
	
	public void outputStack() {
		if (top != 0) {
			for (int i = top - 1; i >= 0; i--) {
				System.out.println(stackArray[i]);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
