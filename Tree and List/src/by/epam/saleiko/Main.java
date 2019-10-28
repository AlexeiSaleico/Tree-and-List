package by.epam.saleiko;

import by.epam.saleiko.list.List;

public class Main {
	public static void main(String[] args) {
		List l = new List();
		l.addFirst(5);
		l.addLast(6);
		l.addFirst(4);
		l.addFirst(3);
		l.addLast(7);
		System.out.println(l.getFirst());
		while(l.next() != null) {
			System.out.println(l.getCurrent());
		}
		System.out.println("дерево");
		Tree t = new Tree(15);
		for(int i = 0; i < 10; i++) {
			int n = (int)(Math.random()*30);
			t.add(n);
		}
		List l2 = new List();
		t.toList(l2);
		System.out.print(l2.getFirst() + " ");
		while(l2.next() != null) {
			System.out.print(l2.getCurrent() + " ");
		}
	}

}
