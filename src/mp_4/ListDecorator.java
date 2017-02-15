package mp_4;

import java.util.List;

public abstract class ListDecorator<E> implements List<E>{

	protected List<E> decoratedList;
	
	public ListDecorator(List<E> decoratedList){
		this.decoratedList = decoratedList;
	}
}
