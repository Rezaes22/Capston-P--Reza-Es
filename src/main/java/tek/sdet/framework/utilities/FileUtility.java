package tek.sdet.framework.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileUtility {

//	in this class we will create a method that returns
//	object of fileInputStream class so we can read any file in bytes.  and ReadYamlFiles classes
	
	
	public static FileInputStream getFileInputStream(String filepath) throws FileNotFoundException {
		return new FileInputStream(new File(filepath));
	}
	

}
