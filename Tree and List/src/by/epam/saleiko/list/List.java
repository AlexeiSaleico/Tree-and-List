package by.epam.saleiko.list;

public class List {
    private Node first;
    private Node last;
    private Node current;
    
    public List() {
        current = first = last = null;
    }
 
    public void addFirst(int value) {
        final Node currFirst = first;
        final Node newNode = new Node(null, currFirst, value);
        first = newNode;
        if(currFirst == null) {  
        	last = newNode;
        }else {
            currFirst.setPrev(newNode);
        }
    }
    
    public void addLast(int value) {
        final Node currLast = last;
        final Node newNode = new Node(currLast, null, value);
        last = newNode;
        if(currLast == null) {
        	first = newNode;
        }else {
            currLast.setNext(newNode);
        }
    }
    
    public int getLast() {
    	current = last;
        return last.getValue();
    }
    
    public int getFirst() {
    	current = first;
        return first.getValue();
    }
    
    public Node next() {
    	current = current.getNext();
    	return current;
    	
    }
    
    public Node prev() {
    	current = current.getPrev();
    	return current;
    }
    public int getCurrent() {
    	return current.getValue();
    }
 
}