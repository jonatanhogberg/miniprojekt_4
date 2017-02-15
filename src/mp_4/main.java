package mp_4;

public class main {

	public static void main(String[] args) {
		
		StrictStack<Integer> stack = new StrictStack();
		
		System.out.println(stack.isEmpty());
		
		stack.push(5);
		stack.push(5);
		stack.push(8);
		stack.push(10);
		stack.push(79);
		
		System.out.println(stack.top());
		
		System.out.println(stack.isEmpty());
		
		for(int i = 0; i < 5; i++){
			System.out.println(stack.pop());
		}
		
		System.out.println(stack.top());
		
		System.out.println(stack.isEmpty());
		
		
		
		

	}

}
