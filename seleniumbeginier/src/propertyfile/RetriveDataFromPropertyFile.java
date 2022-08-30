package propertyfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class RetriveDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		//create a FileInputStream Object using FileInputStream(String name) constructor by passing the property file path
		FileInputStream fis = new FileInputStream("./propertyfiles/pf.properties");
		//create a Properties Class Object
		Properties pobj=new Properties();
		//load the property file using load(InputStream inStream) by passing FileInputStream reference
		pobj.load(fis);
		//get the property value by passing key to the getProperty(String key)
		String browserName=pobj.getProperty("browser");
		System.out.println("browserName :"+browserName);
		System.out.println("url : "+pobj.getProperty("url"));
	}

}
