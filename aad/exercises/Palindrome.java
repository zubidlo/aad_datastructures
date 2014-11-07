package aad.exercises;
import aad.datastructures.Stack;
import aad.datastructures.Queue;
import aad.datastructures.StackImplementation;
import aad.datastructures.QueueImplementation;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class Palindrome {

	public static boolean isPalindrome(String s) {
		
		Stack<Character> stack = new StackImplementation<Character>();
		Queue<Character> queue = new QueueImplementation<Character>();
		
		for(Character ch : s.toCharArray()) {
			stack.push(ch);
			queue.enqueue(ch);
		}
		
		boolean charsAreEqual = true;
		
		while (charsAreEqual && !stack.isEmpty()) {
			charsAreEqual = (stack.pop().equals(queue.dequeue())) ? true : false;
		}
		
		return charsAreEqual;
	}
	
	public static void main(String[] args) throws IOException, URISyntaxException {
		
		String path = "aad/exercises/palindromes.txt";
		List<String> words = Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
		for(String word : words) {
			String result = isPalindrome(word) ? " is " : " is not ";
			System.out.println("\"" + word + "\"" + result + "palindrome");
		}
	}
}