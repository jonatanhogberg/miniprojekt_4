package mp_4;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class StrictStackTest<E> {

	StrictStack<Integer> stack;
	List<E> list;
	
	@Before 
	public void setUp(){
		stack = new StrictStack<>();
	}
	
	@Test
	public void testStrictStack() {
		list = new ArrayList<E>();
		fail("Not yet implemented");
	}

	@Test
	public void testStrictStackListOfE() {
		this.list = list;
		fail("Not yet implemented");
	}

	@Test
	public void testPush() {
		fail("Not yet implemented");
	}

	@Test(expected = EmptyStackException.class)
	public void testPop() {
		stack.pop();
	}

	@Test(expected = EmptyStackException.class)
	public void testTop() {
		stack.top();
	}

	@Test
	public void testIsEmpty() {
		stack.isEmpty();
		fail("Not yet implemented");
	}

}
