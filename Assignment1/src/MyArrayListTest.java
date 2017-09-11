import java.io.File;

public class MyArrayListTest {
	
	public void testMe(MyArrayList myArrayList, Results results){
		if(insertUniquesTest(myArrayList)){
			results.storeNewResults("test insert unique elements passed");
		}
		else{
			results.storeNewResults("test insert unique elements failed, " +
					"element could not be inserted");
		}
		if(removeUniquesTest(myArrayList)){
			results.storeNewResults("test remove unique elements passed");
		}
		else{
			results.storeNewResults("test remove unique elements failed, " +
					"element could not be removed");
		}
		if(insertDuplicate(myArrayList)){
			results.storeNewResults("test insert duplicate element passed");
		}
		else{
			results.storeNewResults("test insert duplicate element failed, " +
					"element could not be inserted");
		}
		if(removeDuplicate(myArrayList)){
			results.storeNewResults("test remove duplicate element passed");
		}
		else{
			results.storeNewResults("test remove duplicate element failed, " +
					"element could not be removed");
		}
		for(int i = 10; i < 26; i++) myArrayList.removeValue(i);
		if(insertOverFifty(myArrayList)){
			results.storeNewResults("test insert over 50 elements passed");
		}
		else{
			results.storeNewResults("test insert over 50 elements failed, " +
					"elements could not be inserted");
		}
		if(removeOverFifty(myArrayList)){
			results.storeNewResults("test remove over 50 elements passed");
		}
		else{
			results.storeNewResults("test remove over 50 elements failed, " +
					"elements could not be removed");
		}
		if(insertOutOfRange(myArrayList)){
			results.storeNewResults("test insert out of range value passed");
		}
		else{
			results.storeNewResults("test insert out of range value failed, " +
					"element could not be inserted");
		}
		if(indexFound(myArrayList)){
			results.storeNewResults("test index of element found passed");
		}
		else{
			results.storeNewResults("test index of element found failed, " +
					"index not found");
		}
		if(indexOfNotFound(myArrayList)){
			results.storeNewResults("test index of element not found passed");
		}
		else{
			results.storeNewResults("test index of element not found failed, " +
					"index found");
		}
		if(sumOfList(myArrayList)){
			results.storeNewResults("test sum of elements passed");
		}
		else{
			results.storeNewResults("test sum of elements failed, " +
					"sum " + myArrayList.sum());
		}
		if(sizeOfList(myArrayList)){
			results.storeNewResults("test size of list passed");
		}
		else{
			results.storeNewResults("test size of list failed, " +
					"incorrect size");
		}
	}
	
	public boolean insertUniquesTest(MyArrayList myArrayList){
		boolean bool = true;
		for(int i = 0; i < 25; i++){
			myArrayList.insertSorted(i);
		}
		for(int i = 0; i < 25; i++){
			if(myArrayList.indexOf(i) != i) bool = false;
		}
		if(myArrayList.sum() != 300) bool = false;
		return bool;
	}
	
	public boolean removeUniquesTest(MyArrayList myArrayList){
		boolean bool = true;
		for(int i = 0; i < 10; i++){
			myArrayList.removeValue(i);
		}
		for(int i = 0; i < 15; i++){
			if(myArrayList.indexOf(i+10) != i) bool = false;
		}
		if(myArrayList.sum() != 255) bool = false;
		return bool;
	}
	
	public boolean insertDuplicate(MyArrayList myArrayList){
		boolean bool = true;
		for(int i = 0; i < 5; i++){
			myArrayList.insertSorted(25);
		}
		if(myArrayList.indexOf(25) != 15) bool = false;
		if(myArrayList.sum() != 380) bool = false;
		return bool;
	}
	
	public boolean removeDuplicate(MyArrayList myArrayList){
		boolean bool = true;
		myArrayList.removeValue(25);
		for(int i = 0; i < 15; i++){
			if(myArrayList.indexOf(i+10) != i) bool = false;
		}
		if(myArrayList.sum() != 255) bool = false;
		return bool;
	}
	
	public boolean insertOverFifty(MyArrayList myArrayList){
		boolean bool = true;
		for(int i = 0; i < 51; i++){
			myArrayList.insertSorted(i);
		}
		for(int i = 0; i < 51; i++){
			if(myArrayList.indexOf(i) != i) bool = false;
		}
		if(myArrayList.sum() != 1275) bool = false;
		return bool;
	}
	
	public boolean removeOverFifty(MyArrayList myArrayList){
		boolean bool = true;
		for(int i = 0; i < 51; i++){
			myArrayList.removeValue(i);
		}
		for(int i = 0; i < 51; i++){
			if(myArrayList.indexOf(i) != -1) bool = false;
		}
		if(myArrayList.sum() != 0) bool = false;
		return bool;
	}
	
	public boolean insertOutOfRange(MyArrayList myArrayList){
		boolean bool = true;
		myArrayList.insertSorted(10002);
		myArrayList.insertSorted(-1);
		if(myArrayList.indexOf(-1) == 0) bool = false;
		if(myArrayList.indexOf(10002) == 1) bool = false;
		if(myArrayList.sum() != 0) bool = false;
		return bool;
	}
	
	public boolean indexFound(MyArrayList myArrayList){
		boolean bool = true;
		for(int i = 0; i < 20; i++){
			myArrayList.insertSorted(i);
		}
		if(myArrayList.indexOf(15) != 15) bool = false;
		for(int i = 0; i < 20; i++){
			myArrayList.removeValue(i);
		}
		return bool;
	}
	
	public boolean indexOfNotFound(MyArrayList myArrayList){
		boolean bool = true;
		if(myArrayList.indexOf(1) != -1) bool = false;
		return bool;
	}
	
	public boolean sumOfList(MyArrayList myArrayList){
		boolean bool = true;
		for(int i = 0; i < 15; i++){
			myArrayList.insertSorted(i);
		}
		if(myArrayList.sum() != 105) bool = false;
		return bool;
	}
	
	public boolean sizeOfList(MyArrayList myArrayList){
		boolean bool = true;
		if(myArrayList.size() != 15) bool = false;
		return bool;
	}
}
