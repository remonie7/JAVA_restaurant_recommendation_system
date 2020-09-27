import java.io.File;
import java.net.URLEncoder;
import java.net.URL;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import javax.swing.*;
public class GoogleAPI {
	public void downloadMap(String location) {
		try {
			String imageURL ="https://maps.googleapis.com/maps/api/staticmap?center="
					+URLEncoder.encode(location, "UTF-8")+"&zoom=17&size=1224x1224&scale=2";
			URL url=new URL(imageURL);
			InputStream is=url.openStream();
			OutputStream os= new FileOutputStream(location);
			byte[] b= new byte[2048];
			int length;
			while ((length = is.read(b)) != -1) {
				os.write(b,0,length);
			}
			is.close();
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public ImageIcon getMap(String location) {
		return new ImageIcon((new ImageIcon(location)).getImage().getScaledInstance(612, 612, java.awt.Image.SCALE_SMOOTH));
	}
	
	public void fileDelete(String fileName) {
		File f= new File(fileName);
		f.delete();
	}
}
