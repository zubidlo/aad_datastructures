package aad.datastructures.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import aad.datastructures.*;

public class NodeTest {

	
	Node<String> previous, node, next;
	
	@Before
	public void setUp(){
		previous = new NodeImplementation<String>("previous");
		node = new NodeImplementation<String>("this");
		next = new NodeImplementation<String>("next");
		
		node.setPrevious(previous);
		node.setNext(next);
		
		previous.setPrevious(next);
		previous.setNext(node);
		
		next.setPrevious(node);
		next.setNext(previous);
		
	}
	
	@Test
	public void testToString() {
		
		
		char[] expectedResult = ("(this,<--previous,-->next)").toCharArray();
		assertArrayEquals(expectedResult, node.toString().toCharArray());
		
		expectedResult = ("(previous,<--next,-->this)").toCharArray();
		assertArrayEquals(expectedResult, previous.toString().toCharArray());
		
		System.out.println(next);
		expectedResult = ("(next,<--this,-->previous)").toCharArray();
		assertArrayEquals(expectedResult, next.toString().toCharArray());
	}

}
