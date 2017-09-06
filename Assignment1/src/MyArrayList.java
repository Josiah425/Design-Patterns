
public class MyArrayList {
	private final int INITIAL_SIZE = 50;
	private int[] arr;
	private int inserted;
	
	MyArrayList(){
		arr = new int[INITIAL_SIZE];
		inserted = 0;
	}
	
	void insertSorted(int newValue){
		if(newValue < 0 || newValue > 10000){
			System.out.println("Array List can only accept values between 0 and 10000, request ignored\n");
			return;
		}
		if(inserted >= INITIAL_SIZE+25){
			System.out.println("Array List reached maximum size, request ignored\n");
			return;
		}
		if(inserted == INITIAL_SIZE && arr.length != INITIAL_SIZE+25){
			int[] temp = new int[INITIAL_SIZE];
			for(int i = 0; i < INITIAL_SIZE; i++){
				temp[i] = arr[i];
			}
			arr = new int[INITIAL_SIZE+25];
			for(int i = 0; i < INITIAL_SIZE; i++){
				arr[i] = temp[i];
			}
		}
		boolean indexFound = false;
		int temp = arr[0];
		for(int i = 0; i < arr.length; i++){
			if(arr[i] >= newValue && !indexFound){
				indexFound = true;
			}
			if(indexFound){
				temp = arr[i];
				arr[i] = newValue;
				newValue = temp;
			}
		}
		inserted++;
	}
	
	void removeValue(int value){
		if(inserted == 0){
			System.out.println("Array List is empty, request ignored\n");
		}
		int shift = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == value){
				shift++;
			}
		}
		int index = arr.length;
		for(int j = 0; j < arr.length; j++){
			if(arr[j] == value){
				index = j;
				break;
			}
		}
		for(int i = index; i < arr.length - shift; i++){
			arr[i] = arr[i+shift];
			if(i >= arr.length-2*shift){
				arr[i+shift] = 10001;
			}
		}
		inserted -= shift;
	}
	
	//TODO what if there is more than one index with that value
	int indexOf(int value){
		if(value < 0 || value > 10000){
			System.out.println("Values can only be between 0 and 10000\n");
			return -1;
		}
		for(int i = 0; i < inserted; i++){
			if(arr[i] == value) return arr[i];
		}
		return -1;
	}
	
	int size(){
		return inserted;
	}
	
	int sum(){
		int sum = 0;
		for(int i = 0; i < inserted; i++){
			sum += arr[i];
		}
		return sum;
	}
}
