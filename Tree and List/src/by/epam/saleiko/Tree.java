package by.epam.saleiko;

import by.epam.saleiko.list.List;

public class Tree {
	private int value;
	private Tree left;
	private Tree right;
	
	Tree(int value){
		left = right = null;
		this.value = value;
	}
	
	public void add(int value) {
		if (value < this.value) {
			if (left == null) left = new Tree(value);
			else left.add(value);
		}else if ( value > this.value) {
			if (right == null) right = new Tree(value);
			else right.add(value);
		}
	}
	
	public void toList(List list) {
	if (left != null) left.toList(list);
	list.addLast(value);
	if (right != null) right.toList(list);
	}
}

