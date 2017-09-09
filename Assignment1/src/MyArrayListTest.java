import java.io.File;

public class MyArrayListTest {
	private MyArrayList list = new MyArrayList();
	
	public boolean insertTest(File fin){
		try{
			FileProcessor fProcessor = new FileProcessor(fin);
			String line = fProcessor.readLine();
			while(line != null){
				int integer = Integer.parseInt(line);
				list.insertSorted(integer);
				line = fProcessor.readLine();
				list.toStr();
			}
			fProcessor.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return true;
	}
	
	public boolean removeTest(File fin){
		try{
			FileProcessor fProcessor = new FileProcessor(fin);
			String line = fProcessor.readLine();
			while(line != null){
				int integer = Integer.parseInt(line);
				list.removeValue(integer);
				line = fProcessor.readLine();
				list.toStr();
			}
			fProcessor.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return true;
	}
}