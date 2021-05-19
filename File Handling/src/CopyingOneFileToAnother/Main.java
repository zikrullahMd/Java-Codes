package CopyingOneFileToAnother;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("C:\\Users\\MD Zikarullah\\eclipse-workspace\\File Handling\\src\\CopyingOneFileToAnother\\1.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("C:\\Users\\MD Zikarullah\\eclipse-workspace\\File Handling\\src\\CopyingOneFileToAnother\\2.txt");
			
			String s;
			while((s = br.readLine())!= null) {
				fw.write(s);
				fw.flush();
			}
			fr.close();
			fw.close();
			System.out.println("File Copying Successfully");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
