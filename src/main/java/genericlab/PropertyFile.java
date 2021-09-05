package genericlab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile implements AutoConstant
{
public String getData(String key) throws FileNotFoundException, IOException {
	Properties p=new Properties();
	p.load(new FileInputStream(propertyFilepath));
	return p.getProperty(key);
}
}
