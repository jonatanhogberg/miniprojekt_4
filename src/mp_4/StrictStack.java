package mp_4;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class StrictStack <E> implements Stack<E> {
	
	private List<E> list;
	
	public StrictStack() {
		list = new ArrayList<E>();
	}
	
	public StrictStack(List<E> list) {
		this.list = list;
	}

	@Override
	public E push(E item) {
		list.add(item);
		return item;
	}

	@Override
	public E pop() {
		if(list.isEmpty()){
			throw new EmptyStackException();
		}else{
			return list.remove(list.size()-1);
		}
	}

	@Override
	public E top() {
		if(list.isEmpty()){
			throw new EmptyStackException();
		}else{
			return list.get(list.size()-1);
		}
	}

	@Override
	public boolean isEmpty() {	
		if(list.size() == 0){
			return true;
		}else
			return false;
	}
}
