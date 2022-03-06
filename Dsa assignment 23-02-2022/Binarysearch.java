package assignment;

public class Binarysearch {

	
		int binarySearch(int arr[], int l, int r, int x)
	    {
	        if (r >= l) {
	            int mid = l + (r - l) / 2;
	            if (arr[mid] == x)
	                return mid;
	            if (arr[mid] > x)
	                return binarySearch(arr, l, mid - 1, x);
	            return binarySearch(arr, mid + 1, r, x);
	        }
	        return -1;
	    }
	    public static void main(String args[])
	    {
	        Binarysearch ob = new Binarysearch();
	        int arr[] = { 'a', 'b', 'd', 'e', 'f','g','h','i','x','z'};
	        int n = arr.length;
	       int x = 'z';
	        int result = ob.binarySearch(arr, 0, n - 1, x);
	        if (result == -1)
	            System.out.println("Element not present");
	        else
	            System.out.println("Element found at index "
	                               + result);
	    }
	// TODO Auto-generated method stub

	}


