package Day4.collectionframework2;
import java.util.ArrayList;
import java.util.Collections;
public class CollectionsSearchingMethods {
	public static void main(String[] args) {
	ArrayList al1=new  ArrayList();
	al1.add("yes");
	al1.add("tr");
	al1.add("ap");
	al1.add("gt");
	al1.add("mum");
	System.out.println(al1);
	//Collections.reverse(al1);
/*	System.out.println(al1);
	System.out.println(Collections.max(al1));
	System.out.println(Collections.min(al1));*/
	
	CustomizeSortingOrder t=new CustomizeSortingOrder();
	Collections.sort(al1,t); // decreasing order
	System.out.println(al1);
	//System.out.println(Collections.binarySearch(al1,"pl",t));
	int x=Collections.binarySearch(al1,"tr",t);
	System.out.println(x);
	if(x<0)
	System.out.println("element is not found");
	else
		System.out.println("element is found");
	}
}
