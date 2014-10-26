package aad.datastructures.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import aad.datastructures.*;

public class QueueTest {
	
	private Queue<String> queue;
	
	private void print(String s) { System.out.println(s); }

	@Before
	public void setUp() throws Exception {
		
		queue = new QueueImplementation<String>();
	}

	@Test
	public void test() {
		
		queue.enqueue("first");
		queue.enqueue("second");
		queue.enqueue("third");
		
		assertFalse(queue.isEmpty());
		print(queue.toString());
		
		print(queue.dequeue());
		print(queue.dequeue());
		print(queue.dequeue());
		
		assertTrue(queue.isEmpty());
		
		queue.enqueue("first");
		queue.enqueue("second");
		queue.enqueue("third");
		
		assertFalse(queue.isEmpty());
		
		queue.dequeueAll();
		assertTrue(queue.isEmpty());
	}

}
