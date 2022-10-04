import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.io.File;

public class SaveImageFromURL {

	public static void main(String[] args) throws Exception {
		creatDIR("./src/image");
		creatDIR("./src/image/card");
		
		for(int i = 1; i < 55; i++){
			String imageUrl = "http://homepage.ntu.edu.tw/~albertchen/image/card/" + i + ".png";
			String destinationFile = "./src/image/card/" + i +".png";
	
			saveImage(imageUrl, destinationFile);
			System.out.println("image "+ i +" saved!");
		}
		
		String imageUrl = "http://homepage.ntu.edu.tw/~albertchen/image/card/b1fv.png";
		String destinationFile = "./src/image/card/b1fv.png";
		saveImage(imageUrl, destinationFile);
		System.out.println("Back card saved!");
	}

	public static void saveImage(String imageUrl, String destinationFile) throws IOException {
		URL url = new URL(imageUrl);
		InputStream is = url.openStream();
		OutputStream os = new FileOutputStream(destinationFile);

		byte[] b = new byte[2048];
		int length;

		while ((length = is.read(b)) != -1) {
			os.write(b, 0, length);
		}

		is.close();
		os.close();
	}
	
	public static void creatDIR(String folderName){
		File theDir = new File(folderName);
		// if the directory does not exist, create it
		if (!theDir.exists()) {
			System.out.println("creating directory: " + folderName);
			boolean result = theDir.mkdir();  
			  
			if(result) {    
				System.out.println("Folder " + folderName + " created");  
			}
		}
	}
}