import java.util.LinkedList;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicLong;

import javax.annotation.PostConstruct;

public class Question2 {

	public static Stack increment(int position, int value, Stack s) {

		LinkedList l = new LinkedList();
		Stack<String> stack = new Stack<String>();
	int sizecount = s.size();

		for (int i = 0; i < s.size(); i++) {
			if (i < position) {
				l.add(value + Integer.parseInt(s.get(i).toString()));
				sizecount--;
			} else {
				l.add(Integer.parseInt(s.get(i).toString()));
			}
		}

		stack.addAll(l);
		return stack;
	}

	public static void main(String[] args) {
		Stack obj = new Stack();
		obj.push(10);
		obj.pop();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj = increment(3, 5, obj);
		obj.push(50);
		obj.push(600);
		obj.pop();
		obj.push(70);
		obj=increment(2, 1, obj);
		obj.push(0);
		
		obj.forEach(p -> System.out.println(p));

	}
}
