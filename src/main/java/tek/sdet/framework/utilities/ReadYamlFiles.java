package tek.sdet.framework.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

import org.yaml.snakeyaml.Yaml;

public class ReadYamlFiles {
	private static ReadYamlFiles readYmalFile;
	private HashMap propertyMap; // this code dose not do anything with the SIngeton Design pattern
	private ReadYamlFiles(String filepath) throws FileNotFoundException {
		FileInputStream fileInputStream = FileUtility.getFileInputStream(filepath);
		Yaml yaml = new Yaml();
		this.propertyMap = yaml.load(fileInputStream);
	}
	public static ReadYamlFiles getInstance(String filePath) throws FileNotFoundException {
		if (readYmalFile == null)
			readYmalFile = new ReadYamlFiles(filePath);
		return readYmalFile;
	}
	public HashMap getYamlProperty(String key) {
		return (HashMap) this.propertyMap.get(key);
	}
}
