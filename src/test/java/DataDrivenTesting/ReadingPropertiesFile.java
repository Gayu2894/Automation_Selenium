package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"//TestData//Config.properties");
        Properties prop=new Properties();
        prop.load(file);
        String url=prop.getProperty("appurl");
		String usrname=prop.getProperty("username");
		String pwd=prop.getProperty("password");
		
		System.out.println(url);
		System.out.println(usrname);
		System.out.println(pwd);
		
		Set<String> key=prop.stringPropertyNames();
		System.out.println(key);
		
		Set<Object> key1=prop.keySet();
		System.out.println(key1);
		
		Collection<Object> value=prop.values();
		System.out.println(value);
		
		for(Object e:prop.keySet())
		{
			System.out.println(e+" "+prop.get(e));
		}
	}

}
