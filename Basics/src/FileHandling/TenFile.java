package FileHandling;

import java.io.*;

public class TenFile {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			try {
FileWriter fw = new FileWriter("//home//prakash//Documents//java//Test//File" + i + ".java");
				BufferedWriter bw = new BufferedWriter(fw);
				if(i==1)
				bw.write("vijay");   // (char) (64 + i)
				if(i==2)
				bw.write("prakash");
				if(i==3)
					bw.write("aravinth");
				if(i==4)
					bw.write("saravana");
				if(i==5)
					bw.write("nataraj");
				if(i==5)
					bw.write("");
				bw.close();
				fw.close();
				System.out.println("sucees for file" + i);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}