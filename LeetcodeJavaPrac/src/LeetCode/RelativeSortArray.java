package LeetCode;
import java.util.*;

public class RelativeSortArray {
	public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length-1];
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> remList = new ArrayList<Integer>();
        HashMap<Integer, Integer> hmap = new HashMap<Integer,Integer>();
        
        for(int in: arr1){
            if (hmap.containsKey(in)){
                hmap.put(in, hmap.get(in)+1);
            }else
                hmap.put(in, 1);
        }
        
        System.out.println(hmap);
        
        for(int ab: arr2){
            if (hmap.containsKey(ab)){
            	int val = hmap.get(ab);
                while (val != 0){
                    arr.add(ab);
                    val--;
                }
                
            }else if(!hmap.containsKey(ab)){
            	remList.add(ab);
            	Collections.sort(remList);
            }
            	
        }
        System.out.println(remList);
        
        arr.addAll(remList);
        System.out.println(arr);
        
        for(int i=0; i < arr.size()-1; i++) {
        	int inT = (int) arr.get(i);
        	result[i] = inT;
        }
        
        
        
        return result;
    }
	
	public static void main(String args[]) {
		int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19}; 
			int[] arr2 = {2,1,4,3,9,6};
		int[] result2 = relativeSortArray(arr1, arr2);
		for(int i=0; i<= result2.length-1; i++) {
			System.out.println(result2[i]);
		}
	}
}
