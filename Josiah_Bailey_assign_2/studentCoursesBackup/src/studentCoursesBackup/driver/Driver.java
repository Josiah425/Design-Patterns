package driver;

import java.io.File;

public class Driver {
	/**
	 * Creates a MyArrayList object, performs tests on it, and outputs
	 * results
	 * @param args
	 */
	public static void main(String[] args) {
		if(args.length < 1){
			System.err.println("Program requires 2 command line arguments");
			System.exit(0);
		}
		File fin = new File(args[0]);
		if(!fin.exists() || fin.isDirectory()){
			System.err.println("File does not exist or is invalid");
			System.exit(0);
		}
		FileProcessor fis = new FileProcessor(fin);
		String temp;
	}
}
