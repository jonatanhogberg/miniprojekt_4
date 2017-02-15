package mp_4;

public class main {

	public static void main(String[] args) {
		
		StrictStack<Integer> stack = new StrictStack();
		
		System.out.println("Är stacken tom: " + stack.isEmpty() + "\n");
		
		System.out.println("första push: " + stack.push(5));
		System.out.println("andra push: " + stack.push(8));
		System.out.println("tredje push: " + stack.push(10));
		System.out.println("fjärde push: " + stack.push(79));
		System.out.println("femte push: " + stack.push(45) + "\n");
		
		System.out.println("Är stacken tom? " + stack.isEmpty() + "\n");
		
		System.out.println("Vilket element ligger överst på stacken? " + stack.top() + "\n");
		
		System.out.println("Tar bort översta elementet, dvs: " + stack.pop() + "\n");
		
		System.out.println("Vilket element ligger på toppen? " + stack.top());
		
		System.out.println("-------------------------------------------------");
	}

}
