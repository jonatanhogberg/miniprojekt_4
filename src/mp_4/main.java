package mp_4;

import java.util.ArrayList;
import java.util.LinkedList;

public class main {

	public static void main(String[] args) {
		
		StrictStack<Integer> stack = new StrictStack();
		ArrayList arrayListTest = new ArrayList();
		ConsoleList consoleListTest = new ConsoleList(arrayListTest);
		
		
		
		
/*		System.out.println("Är stacken tom: " + stack.isEmpty() + "\n");
		
		System.out.println("första push: " + stack.push(5));
		System.out.println("andra push: " + stack.push(8));
		System.out.println("tredje push: " + stack.push(10));
		System.out.println("fjärde push: " + stack.push(79));
		System.out.println("femte push: " + stack.push(45) + "\n");
		
		System.out.println("Är stacken tom? " + stack.isEmpty() + "\n");
		
		System.out.println("Vilket element ligger överst på stacken? " + stack.top() + "\n");
		
		System.out.println("Tar bort översta elementet, dvs: " + stack.pop() + "\n");
		
		System.out.println("Vilket element ligger på toppen? " + stack.top());
		
		System.out.println("-------------------------------------------------");*/
		
		consoleListTest.add(1);
		consoleListTest.add(4, 32);
		consoleListTest.addAll(c);
		consoleListTest.addAll(index, c);
		consoleListTest.clear();
		consoleListTest.contains(o);
		consoleListTest.containsAll(c);
		consoleListTest.get(index);
		consoleListTest.indexOf(o);
		consoleListTest.isEmpty();
		consoleListTest.iterator();
		consoleListTest.lastIndexOf(o);
		consoleListTest.listIterator();
		consoleListTest.listIterator(index);
		consoleListTest.remove(o);
		consoleListTest.remove(index);
		consoleListTest.removeAll(c);
		consoleListTest.retainAll(c);
		consoleListTest.set(index, element);
		consoleListTest.size();
		consoleListTest.subList(fromIndex, toIndex);
		consoleListTest.toArray();
		consoleListTest.toArray(a);
	}

}
