package Evaluation;
import java.util.*;

public class LinKedListSort {
	
	public static LinkedList sort(LinkedList s) {
		LinkedList temp;
		
		while (s != null) {
			temp  = s.next;
			if (temp.val < s.val) {
				temp = s; 
				s = s.next;
				s.next = temp;
			}
		}
//		System.out.println(s.next);
		return s;
		
	}

	public static void main(String args[]) {
		 LinkedList s1 = new LinkedList(1); 
		 s1.next = new LinkedList(4);
		 s1.next.next = new LinkedList(6); 
		 s1.next.next.next = new LinkedList(7);
		 
		 LinkedList s5 = LinKedListSort.sort(s1);
		 
		 while (s5 != null) {
			 LinkedList s2 = s5.next;
			 System.out.println(s2.val);
		 }
		 
		 
		 
	}

	
}
