package aad.datastructures.tests;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import aad.datastructures.ArrayListImlementation;
import aad.datastructures.List;

public class ArrayListTest {

	List<String> list;
	
	@Before
	public void setUp() throws Exception {
		
		list = new ArrayListImlementation<String>();
	}

	@Test
	public void test() {
		
		list.addItem(1, "second");
		list.addItemAtTheBegining("first");
		list.addItemAtTheEnd("third");
		
		assertTrue(list.getItemAtIndex(1).equals("first"));
		assertTrue(list.getItemAtIndex(2).equals("second"));
		assertTrue(list.getItemAtIndex(3).equals("third"));
		
		list.removeItemAtIndex(1);
		assertTrue(list.getItemAtIndex(1).equals("second"));
		
		list.removeItemAtTheEnd();
		assertTrue(list.getItemAtIndex(1).equals("second"));
		
		list.removeItemAtTheBegining();
		assertTrue(list.isEmpty());
		
		list.removeAllItems();
		assertTrue(list.isEmpty());
		
		
	}

}
