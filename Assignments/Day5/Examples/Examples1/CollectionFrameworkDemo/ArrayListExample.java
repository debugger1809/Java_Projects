package CollectionFrameworkDemo;

import java.util.ArrayList;

public class ArrayListExample {

	 void tostring()
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList al=new ArrayList();  // Auto growable array
System.out.println(al.add("Maruthi"));
al.add("L");
al.add(new Integer(1984));
al.add(1985); // autoboxing: automatic convertion of primitve to wrapper
al.add("9177000988l");
al.add("Hyderabad");
al.add(3);
al.add(1985);
System.out.println(al.size());

System.out.println(al); // calls toString() method of arraylist class


al.add(2,"emp4440");
System.out.println(al);

al.remove(4);
System.out.println(al);

System.out.println(al.remove(new Integer(388)));
System.out.println(al);


al.set(4,"9704150345");
System.out.println(al);


System.out.println(al.indexOf(1985));	
System.out.println(al.get(4));
al.add(98);
System.out.println(al);
String s3= (String)al.get(5);
System.out.println(s3);

System.out.println(al.contains("jai"));
al.add("Hyderabad");
al.add("Hyderabad");
System.out.println(al);
al.add(null);
al.add(null);
System.out.println(al);

System.out.println(al.indexOf("Hyderabad132"));
System.out.println(al.indexOf("Hyderabad"));

// get the start index 5
// get the last index 20
// from the 5 , get(6), store in string
// string s=(String)al.get(6);
// s.equals("hyderabad");// true

System.out.println(al.lastIndexOf("Hyderabad"));

System.out.println(al.size());
al.add("jai");
System.out.println(al.contains("jai"));

System.out.println(al.size());
//System.out.println(al.get(80));
System.out.println(al);

//System.out.println(al.get(250));
	}
}