package aad.datastructures.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import aad.datastructures.*;

public class LinkedListTest {

	ListImplementation<String> list;
	Node<String> first, second, third;
	
	@Before
	public void setUp(){
		list = new ListImplementation<String>();
		
		first = new NodeImplementation<String>("first");
		second = new NodeImplementation<String>("second");
		third = new NodeImplementation<String>("third");
		
		list.addItemAtTheBegining(first.getItem());
		list.addItemAtTheEnd(third.getItem());
		list.addItem(2, second.getItem());
		//System.out.println("after initialization:\n" + list);
	}

	@Test
	public void testAdd() {

		assertTrue(list.getHead().equals(first));
		assertTrue(list.getHead().getPrevious().equals(third));
		assertTrue(list.getHead().getNext().equals(second));
		
		assertTrue(list.getNodeAtIndex(2).equals(second));
		assertTrue(list.getNodeAtIndex(2).getPrevious().equals(first));
		assertTrue(list.getNodeAtIndex(2).getNext().equals(third));
		
		assertTrue(list.getTail().equals(third));
		assertTrue(list.getTail().getPrevious().equals(second));
		assertTrue(list.getTail().getNext().equals(first));

	}

	@Test
	public void testRemoveAll() {
		
		list.removeAllItems();
		assertTrue(list.isEmpty());
	}

	@Test
	public void testRemoveItemAtIndex() {
		
		list.removeItemAtIndex(2);
		assertTrue(list.size() == 2);
		assertTrue(list.getHead().equals(first));
		assertTrue(list.getHead().getPrevious().equals(third));
		assertTrue(list.getHead().getNext().equals(third));
		
		assertTrue(list.getTail().equals(third));
		assertTrue(list.getTail().getPrevious().equals(first));
		assertTrue(list.getTail().getNext().equals(first));
		
		list.removeItemAtTheBegining();
		assertTrue(list.size() == 1);
		assertTrue(list.getHead().equals(third));
		assertTrue(list.getHead().getPrevious().equals(third));
		assertTrue(list.getHead().getNext().equals(third));
		
		list.removeItemAtTheEnd();
		assertTrue(list.isEmpty());
	}

	@Test
	public void testRemoveNode() {
		
		list.removeNode(list.getHead().getNext());
		assertTrue(list.size() == 2);
		assertTrue(list.getHead().equals(first));
		assertTrue(list.getHead().getPrevious().equals(third));
		assertTrue(list.getHead().getNext().equals(third));
	}
}
