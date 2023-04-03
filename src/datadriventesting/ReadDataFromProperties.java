package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperties {

	public static void main(String[] args) throws IOException {
		//Step 1: Convert physical file into java readable Object
		// new FileInputStream(); throws FileNotFoundException
		FileInputStream fis = new FileInputStream("./testResources/data.properties");

		//Step 2: Create an instance of Properties class
		// Properties class should be imported from java.util package
		Properties property = new Properties();
		
		//Step 3: Load all key value pairs to Properties Object from fis
		// property.load(fis); throws IOException 
		property.load(fis);
		
		//Step 4: Read data using Properties object
		System.out.println(property.getProperty("url"));
	}

}
