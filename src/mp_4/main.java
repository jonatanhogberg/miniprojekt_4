package mp_4;

import java.util.ArrayList;
import java.util.Collection;
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
		
		Collection c = new ArrayList<Integer>();
		c.add(1); c.add(2); c.add(3);
		Object o = 8;
		
		System.out.println("Demo av metoder: " + "\n"
				+ " add(E e) " + "\n"
				+ " add(int index, E element)" + "\n"
				+ " addAll(Collection<? extends E> c)" + "\n" 
				+ " addAll(int index, Collection<? extends E> c) " + "\n"
				+ " size()" + "\n"
				+ " contains(Object o)" + "\n"
				+ " containsAll(Collection<?> c)" + "\n"
				+ " subList(int fromIndex, int toIndex)" + "\n"
				+ " get(int index)" + "\n"
				+ " indexOf(Object o)" + "\n"
				+ " isEmpty()" + "\n"
				+ " lastIndexOf(Object o)" + "\n"
				+ " remove(Object o)" + "\n"
				+ " remove(int index)" + "\n"
				+ " set(int index, E element)" + "\n"
				+ " retainAll(Collection<?> c)" + "\n"
				+ " removeAll(Collection<?> c)" + "\n"
				+ " clear()" + "\n"
				);
		
		System.out.print("Lades ett element till i slutet av listan? ");
		consoleListTest.add(3);
		System.out.println(arrayListTest + "\n");
		
		System.out.println("Lägg till elementet 8 på postionen 0 i listan ");
		consoleListTest.add(0, 8);
		System.out.println();
		
		System.out.print("Lades kollektionen [1, 2, 3] till i slutet av listan? ");
		consoleListTest.addAll(c);
		System.out.println(arrayListTest + "\n");
		
		System.out.print("Lades kollektionen [1, 2, 3] till från postion 0 i listan? ");
		consoleListTest.addAll(0, c);
		System.out.println(arrayListTest + "\n");
		
		System.out.print("Hur många element finns i listan? ");
		consoleListTest.size();
		System.out.println();
		
		System.out.print("Innehåller listan elementet 8? ");
		consoleListTest.contains(8);
		System.out.println();
		
		System.out.print("Innehåller listan alla element från kollektionen [1, 2, 3]? ");
		consoleListTest.containsAll(c);
		System.out.println();
		
		System.out.println("Gör en lista av elementen mellan positionerna 2 och 5");
		consoleListTest.subList(2, 5);
		System.out.println();
		
		System.out.println("Vilket element befinner sig i position 3 i listan? ");
		consoleListTest.get(3);
		System.out.println();
		
		System.out.println("Vilken postion har elementet 8 i listan? ");
		consoleListTest.indexOf(8);
		System.out.println();
		
		System.out.print("Är listan tom? ");
		consoleListTest.isEmpty();
		System.out.println();
		
		System.out.println("Vilken position förekommer elementet 3 senast i listan? ");
		consoleListTest.lastIndexOf(3);
		System.out.println();
		
		System.out.print("Togs elementet 8 bort från listan? ");
		consoleListTest.remove(o);
		System.out.println(arrayListTest + "\n");
		
		System.out.println("Elementet på postion 3 togs bort. Vilket element togs bort? ");
		consoleListTest.remove(3);
		System.out.println();
		
		System.out.println("De tre första elementen i listan byttes ut. Elementen som försvann var ");
		consoleListTest.set(0, 79);
		consoleListTest.set(1, 14);
		consoleListTest.set(2, 38);
		System.out.println("Listan med de nya elementen " + arrayListTest + "\n");
		
		System.out.print("Togs alla element som inte finns i kollektionen [1, 2, 3] bort? ");
		consoleListTest.retainAll(c);
		System.out.println(arrayListTest + "\n");
		
		System.out.print("Togs alla element bort från listan? ");
		consoleListTest.removeAll(c);
		System.out.println(arrayListTest + "\n");
		
		System.out.print("Lades kollektionen [1, 2, 3] till i slutet av listan? ");
		consoleListTest.addAll(c);
		System.out.println(arrayListTest + "\n");
		
		System.out.println("Ta bort alla element från listan");
		consoleListTest.clear();
	}

}
