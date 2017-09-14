import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class Results implements FileDisplayInterface, StdoutDisplayInterface{
	private ArrayList<String> sal = new ArrayList<String>();
	private String outputFileName;
	private PrintWriter out;
	
	Results(String output){
		outputFileName = output;
		try{
			out = new PrintWriter(outputFileName, "UTF-8");
		}
		catch(IOException e){
			System.err.println("Could not create/load output file");
		}
	}
	
	public void close(){
		out.close();
	}
	
	public void writeToFile(String s){
		out.println(s);
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
