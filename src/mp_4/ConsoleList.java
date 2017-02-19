package mp_4;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ConsoleList<E> extends ListDecorator<E> {

	public ConsoleList(List<E> decoratedList) {
		super(decoratedList);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean add(E e) {
		boolean add = decoratedList.add(e);
		System.out.println(add);
		return add;
	}

	@Override
	public void add(int index, E element) {
		decoratedList.add(index, element);
		System.out.println(decoratedList);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		boolean addAll = decoratedList.addAll(c);
		System.out.println(addAll);
		return addAll;
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		boolean addAll = decoratedList.addAll(index, c);
		System.out.println(addAll);
		return addAll;
	}

	@Override
	public void clear() {
		decoratedList.clear();
		System.out.println(decoratedList);
	}

	@Override
	public boolean contains(Object o) {
		boolean contains = decoratedList.contains(o);
		System.out.println(contains);
		return contains;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		boolean containsAll = decoratedList.containsAll(c);
		System.out.println(containsAll);
		return containsAll;
	}

	@Override
	public E get(int index) {
		E getIndex = decoratedList.get(index);;
		System.out.println(getIndex);
		return getIndex;
	}

	@Override
	public int indexOf(Object o) {
		int indexOf = decoratedList.indexOf(o);
		System.out.println(indexOf);
		return indexOf;
	}

	@Override
	public boolean isEmpty() {
		boolean isEmpty = decoratedList.isEmpty();
		System.out.println(isEmpty);
		return isEmpty;
	}
	
	@Override
	public Iterator<E> iterator() {
		Iterator<E> iterator = decoratedList.iterator();
		System.out.println(iterator);
		return iterator;
	}

	@Override
	public int lastIndexOf(Object o) {
		int lastIndexOf = decoratedList.lastIndexOf(o);
		System.out.println(lastIndexOf);
		return lastIndexOf;
	}

	@Override
	public ListIterator<E> listIterator() {
		ListIterator<E> listIterator = decoratedList.listIterator();
		System.out.println(listIterator);
		return listIterator;
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		ListIterator<E> listIterator = decoratedList.listIterator(index);
		System.out.println(listIterator);
		return listIterator;
	}

	@Override
	public boolean remove(Object o) {
		boolean remove = decoratedList.remove(o);
		System.out.println(remove);
		return remove;
	}

	@Override
	public E remove(int index) {
		E remove = decoratedList.remove(index);
		System.out.println(remove);
		return remove;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		boolean removeAll = decoratedList.removeAll(c);
		System.out.println(removeAll);
		return removeAll;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		boolean retainAll = decoratedList.retainAll(c);
		System.out.println(retainAll);
		return retainAll;
	}

	@Override
	public E set(int index, E element) {
		E set = decoratedList.set(index, element);
		System.out.println(set);
		return set;
	}

	@Override
	public int size() {
		int size = decoratedList.size();
		System.out.println(size);
		return size;
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		List<E> subList = decoratedList.subList(fromIndex, toIndex);
		System.out.println(subList);
		return subList;
	}

	@Override
	public Object[] toArray() {
		Object[] toArray = decoratedList.toArray();
		System.out.println(toArray);
		return toArray;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		T[] toArray = decoratedList.toArray(a);
		System.out.println(toArray);
		return toArray;
	}
}
