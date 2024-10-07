package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchingDataFromPropertyFile {

	public String fetchingDataFromPropertyFile(String path,String keys) throws IOException {
		
		/*
		-creating the object of FileInputStream class
		-FileInputStream is meant for reading streams of raw bytes such as image data. 
		 For reading streams of characters, consider using FileReader. 
		*/
		FileInputStream f=new FileInputStream(path);
		
		/*
		 -creating the object of Properties class
		 The Properties class represents a persistent set of properties. The Properties 
		 can be saved to a stream or loaded from a stream. Each key and its corresponding 
		 value in the property list is a string.  
		 */
		
		Properties p=new Properties();
		
		//load the keys into TestScript
		p.load(f);
		
		//provide the key
		return p.getProperty(keys);
	}

}
