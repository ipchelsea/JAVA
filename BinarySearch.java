package binarysearch;

public class BinarySearch {

	public static void main(String[] args) {
		int[] array = { 1, 3, 5, 6, 7, 8, 9, 11, 13, 14, 15 };

		System.out.println("Expected 2 " + binarySearch1(array, 5));
		System.out.println("Expected 3 " + binarySearch1(array, 6));
		System.out.println("Expected 4 " + binarySearch1(array, 7));
		System.out.println("Expected 10 " + binarySearch1(array, 15));
		System.out.println("Expected -1 " + binarySearch1(array, 20));

		System.out.println("Expected 0 " + binarySearch2(array, 1, 0, array.length - 1));
		System.out.println("Expected 1 " + binarySearch2(array, 3, 0, array.length - 1));
		System.out.println("Expected 6 " + binarySearch2(array, 9, 0, array.length - 1));
		System.out.println("Expected -1 " + binarySearch2(array, 20, 0, array.length - 1));
	}

	// iterative binarySearch
	public static int binarySearch1(int[] array, int value) {
		int lowIndex = 0;
		int highIndex = array.length - 1; // property instance variable

		while (lowIndex <= highIndex) {
			int mid = (lowIndex + highIndex) / 2;

			if (array[mid] > value) // throw away the top half of the array - move highIndex
				highIndex = mid - 1;

			else if (array[mid] < value) // throw away the bottom half- move lowIndex
				lowIndex = mid + 1;
			else
				return mid;

		}
		return -1; // we have not found the value
	}
	//return binarySearch2(array,value,array.length-1);

	// recursive binarySearch
	private  static int binarySearch2(int[] array, int value, int lowIndex, int highIndex) {
		
		 if(lowIndex <= highIndex) {
			int mid = (lowIndex + highIndex) / 2;

			if (array[mid] > value) // throw away the top half of the array - move highIndex
				return binarySearch2(array, value,lowIndex,mid-1);
				//highIndex = mid - 1;

			else if (array[mid] < value) // throw away the bottom half- move lowIndex
				return binarySearch2(array, value,mid+1, highIndex);
				//lowIndex = mid + 1;
			else
				return mid;

		}
		return -1;

	}
}
