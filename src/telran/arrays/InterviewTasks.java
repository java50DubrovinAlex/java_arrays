package telran.arrays;

public class InterviewTasks {
	public static boolean isSumTwo(short[] array, short sum) {
		boolean[] helper = new boolean[sum > 0 ? sum + 1 : Short.MAX_VALUE];
		boolean res = false;
		int index = 0;
		while (index < array.length && !res) {
			short num = (short) (sum - array[index]);
			if (num >= 0) {
				if (helper[num]) {
					res = true;
				} else {
					helper[array[index]] = true;
				}
			}
			index++;
		}
		return res;
	}

	public static void sort(short[] array) {
		int arrayIndex = 0;
		int helperIndex = 0;
		int[] helper = new int[Short.MAX_VALUE];
		for (int i = 0; i < array.length; i++) {
			helper[array[i]] += 1;
		}
		while (arrayIndex < array.length) {
			if (helper[helperIndex] > 0) {
				array[arrayIndex] = (short) helperIndex;
				helper[helperIndex] -= 1;
				arrayIndex++;
			} else {
				helperIndex++;
			}
		}
	}

	public static short getMaxWithNegativePresentation(short[] array) {
		int[] helper = new int[Short.MAX_VALUE];
		int index = helper.length - 1;
		for (int i = 0; i < array.length; i++) {
			helper[Math.abs(array[i])] += 1;
		}
		while (index >= 0) {
			if (helper[index] == 2) {
				return (short) index;
			}
			index--;

		}
		return -1;
	}
}
