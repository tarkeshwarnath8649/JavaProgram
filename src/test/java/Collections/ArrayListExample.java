package Collections;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		al.add(2,50);
		
		for(Object a : al) {
			System.out.println(a);
		}
		System.out.println("**************************************");
		al.set(2, 100);
		
		for(Object a : al) {
			System.out.println(a);
		}
	}

}
