package FileHandling;

import java.io.*;

public class TenFile {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			try {
				FileWriter fw = new FileWriter("//home//prakash//Documents//java//Test//File" + i + ".java");
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write((char) (64 + i));
				bw.close();
				fw.close();
				System.out.println("sucees for file" + i);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}