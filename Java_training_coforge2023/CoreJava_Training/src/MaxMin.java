
public class MaxMin {
	
	public static void main(String[] args) {
		
		int arr[] = {11,23,67,43,8,90,123};
		
		// Print array using normal for loop
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+", ");
		}		
		
		// Print array using for each loop
		for (int i : arr) {
			System.out.print(i+", ");
		}
		
		// To print the sum off array using static function
		System.out.println("\nSum of array is = "+sum(arr));
		
		System.out.print("Respectively the maximum and minimum values are = ");
		
		// Calling the minmax function
		for(int res: minmax(arr)) {
			System.out.print(res+" ");
		}
		
	}
	
	
	// Static function for calculating sum
	static int sum(int arr[]) {
		int sum = 0;
		for(int i: arr) {
			sum += i;
		}
		return sum;
	}
	
	// Static function for calculating min and max value in array
	static int[] minmax (int arr[]) {
		
		// creating result array
		int res[] = new int[2];
		int min = 0,max = 0;
		
		for(int i=0; i< arr.length; i++) {
			if(i == 0)
				min = max = 0;
			else if(arr[i]>max)
				max = arr[i];
			else if(arr[i]<min)
				min = arr[i];	
		}
		res[0] = max;
		res[1] = min;	
		return res;
	}
	
}
