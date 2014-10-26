package aad.datastructures.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import aad.datastructures.*;

public class StackTest {

	Stack<String> stack;
	Node<String> first,second,third;
	
	@Before
	public void setUp(){
		stack = new StackImplementation<String>();
		
		first = new NodeImplementation<String>("first");
		second = new NodeImplementation<String>("second");
		third = new NodeImplementation<String>("third");
		
		stack.push(first.getItem());
		stack.push(second.getItem());
		stack.push(third.getItem());
		
		System.out.println("after initialization:\n" + stack);
	}
	
	
	@Test
	public void testPop() {
		stack.pop();
		assertTrue(!stack.isEmpty());
		System.out.println("after first pop():\n" + stack);
		stack.pop();
		assertTrue(!stack.isEmpty());
		System.out.println("after second pop():\n" + stack);
		stack.pop();
		assertTrue(stack.isEmpty());
		System.out.println("after third pop():\n" + stack);
	}

	
}
