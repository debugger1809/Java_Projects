package CollectionFrameworkDemo;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector v=new Vector();
v.addElement("A");
System.out.println(v.capacity());
for(int i=1;i<10;i++)
v.addElement(i);
System.out.println(v.capacity());
v.add("B");
System.out.println(v.capacity());
System.out.println(v);
	}

}
