package by.epam.saleiko.list;

public class Node {
    private Node next;
    private Node prev;
    private int value;
    
    public Node(Node prev, Node next, int value) {
        this.setPrev(prev);
        this.setNext(next);
        this.setValue(value);
    }

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}

