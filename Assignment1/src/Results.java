import java.util.ArrayList;
import java.util.Iterator;


public class Results implements FileDisplayInterface, StdoutDisplayInterface{
	private ArrayList<String> sal = new ArrayList<String>();
	
	public void writeToFile(String s){
		
	}
	
	public void writeToStdout(String s){
		System.out.println(s);
	}
	
	public void storeNewResults(String s){
		sal.add(s);
	}
	
	public String getString(int i){
		return sal.get(i);
	}
	
	public int getStringArrSize(){
		return sal.size();
	}
}
