package mp_4;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ConsoleList<E> extends ListDecorator<E>{

	public ConsoleList(List<E> decoratedList) {
		super(decoratedList);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean add(E e) {
		return decoratedList.add(e);
	}

	@Override
	public void add(int index, E element) {
		decoratedList.add(index, element);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		return decoratedList.addAll(c);
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		return decoratedList.addAll(index, c);
	}

	@Override
	public void clear() {
		decoratedList.clear();
	}

	@Override
	public boolean contains(Object o) {
		return decoratedList.contains(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return decoratedList.containsAll(c);
	}

	@Override
	public E get(int index) {
		return decoratedList.get(index);
	}

	@Override
	public int indexOf(Object o) {
		return decoratedList.indexOf(o);
	}

	@Override
	public boolean isEmpty() {
		return decoratedList.isEmpty();
	}
	
	@Override
	public Iterator<E> iterator() {
		return decoratedList.iterator();
	}

	@Override
	public int lastIndexOf(Object o) {
		return decoratedList.lastIndexOf(o);
	}

	@Override
	public ListIterator<E> listIterator() {
		return decoratedList.listIterator();
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		return decoratedList.listIterator(index);
	}

	@Override
	public boolean remove(Object o) {
		return decoratedList.remove(o);
	}

	@Override
	public E remove(int index) {
		return decoratedList.remove(index);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return decoratedList.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return decoratedList.retainAll(c);
	}

	@Override
	public E set(int index, E element) {
		return decoratedList.set(index, element);
	}

	@Override
	public int size() {
		return decoratedList.size();
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		return decoratedList.subList(fromIndex, toIndex);
	}

	@Override
	public Object[] toArray() {
		return decoratedList.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return decoratedList.toArray(a);
	}
}
