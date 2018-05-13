import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Properties;

public class LoadProp {

	public String getPorp() {
		String key = null;
		Properties prop = new Properties();
		InputStream input = null;

		try {

			input = new FileInputStream("data/jLive.license");

			// load a properties file
			prop.load(input);

			// get the property value and print it out
			System.out.println(prop.getProperty("from"));
			System.out.println(prop.getProperty("to"));
			System.out.println(prop.getProperty("key"));
			
			InetAddress address = InetAddress.getLocalHost();

			System.out.println("로컬컴퓨터 이름:"+address.getHostName());

			System.out.println("로컬컴퓨터 IP주소:"+address.getHostAddress());
			String ip = address.getHostAddress();
 
			key = prop.getProperty("from") + prop.getProperty("to")+ip;
			
			
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return key;
	}

	public static void main(String[] args) {
		LoadProp p = new LoadProp();
		String key = p.getPorp();
		System.out.println(key);
	}

}
