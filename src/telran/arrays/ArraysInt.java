package telran.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysInt {
	public static int [] addNumber(int [] array, int number) {
		int [] res = Arrays.copyOf(array, array.length + 1);
		res[array.length] = number;     
		return res;
		
	}
	public static int [] insertNumber (int [] array, int index, int number) {
		int [] res = new int [array.length + 1];
		System.arraycopy(array, 0, res, 0, index);
		res[index] = number;
		System.arraycopy(array, index, res, index + 1, array.length - index);
		return res;
	}
	public static int [] removeNumber(int [] array, int index) {
		int [] res = new int [array.length - 1];
		System.arraycopy(array, 0, res, 0, index);
		System.arraycopy(array, index + 1, res, index, res.length - index);
		return res;
	}
	public static int[] insertNumberSorted(int [] arraySorted, int number) {
		int index = Arrays.binarySearch(arraySorted, number);
		if(index < 0) {
			index = -index - 1;
		}
		
//		int index = Arrays.binarySearch(arraySorted, number) < 0 ? Arrays.binarySearch(arraySorted, number) * -1 - 1: Arrays.binarySearch(arraySorted, number);
		
		return insertNumber(arraySorted, index, number);
	}
	
	public static int searchNumber(int [] array, int number) {
		int index = 0;
		while(index < array.length && array[index] != number) {
			index ++;
		}
		return index < array.length ? index : -1; 
	}
	
	
	
	public static int binarySearchNumber(int []array, int number) {
		int left = 0;
		int right = array.length - 1;
		int middle = right / 2;
		int expIndex = 0;
		boolean flEqual = false;
		while(left <= right    ) {
			if(number == array[middle]) {
				flEqual = true;
			}
			if(number > array[middle]) {
				
				left = middle + 1;
			} else {
				right = middle - 1;
			}
			
			middle = (left + right) / 2;
		}
		if(left > right) {
			expIndex = -left -1;
		}
		return  flEqual ? -expIndex -1 : expIndex;
	}
	
	
	
	
	public static void quickSort(int [] array) {
		Arrays.sort(array); // O[N logN]
	}
	public static void bubleSort(int [] array) {
		int length = array.length;
		boolean flSorted = false;
		do {
			length--;
			flSorted = true;
			for(int i = 0;i < length;i++) {
				if(array[i] > array[i + 1]) {
					swap(array, i, i + 1);
					flSorted = false;
				}
			}
		}while(!flSorted);
	}
	private static void swap(int[] array, int i, int j) {
//		array[i] = array[i] + array[j];
//		array[i + 1] = array[i] - array[j];
//		array[i] = array[i] - array[j];
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
		
	}
	public static int getRandomInt(int min, int max) {
		Random gen = new Random();
		return gen.nextInt(min, max + 1);
	}
	
	
	// ################ Additional Task 01 ######################

	public static int maxSubsequenceLength(int[] arr) {
		int maxCount = 0;
		int count = 1;
		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] == arr[i + 1]) {
				count++;
			} else if (count > maxCount) {
				maxCount = count;
				count = 1;
			}

		}
		return maxCount < count ? count - 1 : maxCount;
	}

	// ################ Additional Task 02 ######################

	public static String toBinaryStr(int number) {
		String res = "";
		do {
			res = (number % 2) + res;
			number /= 2;
		} while (number > 0);
		return res;
	}
	

}
