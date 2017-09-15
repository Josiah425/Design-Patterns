import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileProcessor {
	private FileInputStream fis;
	private BufferedReader br;
	
	/**
	 * Constructor for a FileProcessor
	 * @param (File) fin
	 */
	FileProcessor(File fin){
		try{
			fis = new FileInputStream(fin);
		}
		catch(IOException e){
			System.err.println("Error creating FileInputStream");
			System.exit(1);
		}
		br = new BufferedReader(new InputStreamReader(fis));
	}
	
	/**
	 * Reads a line from the buffered reader
	 * 
	 * @return
	 */
	public String readLine(){
		String line = null;
		try{
			line = br.readLine();
		}
		catch(IOException e){
			System.err.println("Error reading line from BufferedReader");
		}
		return line;
	}
	
	/**
	 * Closes the buffered reader and the file input stream
	 */
	public void close(){
		try{
			br.close();
			fis.close();
		}
		catch(IOException e){
			System.err.println("Error closing FileInputStream & BufferedReader");
			System.exit(1);
		}
	}
}
