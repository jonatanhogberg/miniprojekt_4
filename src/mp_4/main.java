package mp_4;

import java.util.ArrayList;
import java.util.Collection;

public class main {

	public static void main(String[] args) {
		
		StrictStack<Integer> stack = new StrictStack();
		ArrayList arrayList = new ArrayList();
		ConsoleList consoleList = new ConsoleList(arrayList);
			
		
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
		consoleList.add(3);
		System.out.println(arrayList + "\n");
		
		System.out.println("Lägg till elementet 8 på postionen 0 i listan ");
		consoleList.add(0, 8);
		System.out.println();
		
		System.out.print("Lades kollektionen [1, 2, 3] till i slutet av listan? ");
		consoleList.addAll(c);
		System.out.println(arrayList + "\n");
		
		System.out.print("Lades kollektionen [1, 2, 3] till från postion 0 i listan? ");
		consoleList.addAll(0, c);
		System.out.println(arrayList + "\n");
		
		System.out.print("Hur många element finns i listan? ");
		consoleList.size();
		System.out.println();
		
		System.out.print("Innehåller listan elementet 8? ");
		consoleList.contains(8);
		System.out.println();
		
		System.out.print("Innehåller listan alla element från kollektionen [1, 2, 3]? ");
		consoleList.containsAll(c);
		System.out.println();
		
		System.out.println("Gör en lista av elementen mellan positionerna 2 och 5");
		consoleList.subList(2, 5);
		System.out.println();
		
		System.out.println("Vilket element befinner sig i position 3 i listan? ");
		consoleList.get(3);
		System.out.println();
		
		System.out.println("Vilken postion har elementet 8 i listan? ");
		consoleList.indexOf(8);
		System.out.println();
		
		System.out.print("Är listan tom? ");
		consoleList.isEmpty();
		System.out.println();
		
		System.out.println("Vilken position förekommer elementet 3 senast i listan? ");
		consoleList.lastIndexOf(3);
		System.out.println();
		
		System.out.print("Togs elementet 8 bort från listan? ");
		consoleList.remove(o);
		System.out.println(arrayList + "\n");
		
		System.out.println("Elementet på postion 3 togs bort. Vilket element togs bort? ");
		consoleList.remove(3);
		System.out.println();
		
		System.out.println("De tre första elementen i listan byttes ut. Elementen som försvann var ");
		consoleList.set(0, 79);
		consoleList.set(1, 14);
		consoleList.set(2, 38);
		System.out.println("Listan med de nya elementen " + arrayList + "\n");
		
		System.out.print("Togs alla element som inte finns i kollektionen [1, 2, 3] bort? ");
		consoleList.retainAll(c);
		System.out.println(arrayList + "\n");
		
		System.out.print("Togs alla element bort från listan? ");
		consoleList.removeAll(c);
		System.out.println(arrayList + "\n");
		
		System.out.print("Lades kollektionen [1, 2, 3] till i slutet av listan? ");
		consoleList.addAll(c);
		System.out.println(arrayList + "\n");
		
		System.out.println("Ta bort alla element från listan");
		consoleList.clear();
	}
}
