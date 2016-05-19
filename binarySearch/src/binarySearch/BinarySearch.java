package binarySearch;
/**
 * Date 05/18/2016
 * @author Tayyab
 */
public class BinarySearch {
	public static  int binarySearch(int low, int high, int[] a, int value) {

		
		int mid = (low + high) / 2;
		if (a[mid] == value) 
		      return mid;
		 else if (a[mid] > value) 
			return binarySearch(low, mid - 1, a, value);
			
		 else if (a[mid] < value) 
			return  binarySearch(mid + 1, high, a, value);
		 
		return -1;
			
	   

	}

	public static void main(String[] args) {
		int data[] = { 1,4,7,9,17,67 };
		int len = data.length;
		int result = binarySearch(0, len - 1, data,17);
		System.out.println("index where value  is: "+result);
	}
}