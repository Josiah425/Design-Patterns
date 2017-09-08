import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileProcessor {
	public String readLine(File fin) throws IOException{
		String line;
		FileInputStream fis = new FileInputStream(fin);
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		line = br.readLine();
		br.close();
		return line;
	}
}
