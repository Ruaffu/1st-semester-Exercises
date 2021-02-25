class Main{
	
	public static void main(String[] args){

		// a
		int[] myIntArray = {10, 4, 6};
		String[] myStringArray = {"Greetings fellow earthlings", "How do you do, fellow kids?", "Im not funny"};
		boolean[] myBooleanArray = {false, true, false};

		printMyStringArray(myStringArray);

		System.out.println(sumOfIntArray(myIntArray));

		System.out.println(averageOfIntArray(myIntArray));

		System.out.println(sortedIntArray(myIntArray));


	}

	// b
	public static void printMyStringArray(String[] stringArrays){
		for (int i = 0; i < stringArrays.length; i++) {
			System.out.println(stringArrays[i]);
		}
	}

	// c
	public static int sumOfIntArray(int[] intArray){
		int sum = 0;

		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}
		return sum;
	}

	// d
	public static int averageOfIntArray(int[] intArray){
		int sum = 0;
		int average;

		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
			

		}
		average = sum/intArray.length;
		return average;
	}

	// e
/*	public static int sortedIntArray(int[] intArray){
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray.length; j++) {
				int tmp = 0;
				if (intArray[i] > intArray[j]) {
					tmp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = tmp;
				}
			}
		}
	} 
*/
}