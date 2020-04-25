package CollectionsAssignmentPackage;
import java.util.*;
/*
 * 3.	Write a program that reads words from keyboard and 
 * displays all the non-duplicate words in ascending order. 
 */



public class CollectionsAssignmentQues3 {
	public static void returnDuplicates(ArrayList StrArray){
		try {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		ArrayList<String> result = new ArrayList<String>();
		for(int i = 0; i < StrArray.size(); i++) {
			String item = (String) StrArray.get(i);
			if (!map.containsKey(item) || item == null){
				map.put((item), 1);
			}else {
				map.put(item, map.get(item)+1);		
			}
		}
		
		
		for (Map.Entry<String, Integer> val: map.entrySet()) {
			if (val.getValue() > 1) {
				continue;
			}
			else {
				result.add(val.getKey());
				
			}	
		}
		
		Collections.sort(result);
		System.out.println(result);
		
		}catch(NullPointerException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> stringArray = new ArrayList<String>(10);
		System.out.println("Enter some strings and type exit to end input: ");
		while (true){
		    String input = sc.next();
		    
		    if(input.equalsIgnoreCase("stop")){ 
		    	break;
	    	}
		    else {stringArray.add(input) ;
		    
		    }
		    
		}
		returnDuplicates(stringArray);
		sc.close();
	}
	
}

/*
 * Enter some strings and type exit to end input: 
abhi
kan
new
sid
sid
new2
stop
[abhi, kan, new, new2]
*/
