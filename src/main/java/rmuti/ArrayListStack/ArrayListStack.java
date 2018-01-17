package rmuti.ArrayListStack;

import java.util.ArrayList;

public class ArrayListStack {
	private ArrayList lst; 
	
	public ArrayListStack() {	
		lst = new ArrayList();
	}
    public void push(Object e) {
    	lst.add(e);
    }
    public Object peak() {
    	return lst.get(lst.size()-1);
    }
    public Object pop() {
    	Object obj = peak();
    	lst.remove(lst.size()-1);
    	return obj;
    }
    //Override
    public String toString() {
    	return lst.toString();
    }
}