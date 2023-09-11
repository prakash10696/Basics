package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadProgram {

public static void main(String[] args) {
	try {
		FileReader fr = new FileReader("//home//prakash//Documents//java//Test.java");
		BufferedReader br = new BufferedReader(fr);
		while (br.ready()) {
		System.out.println(br.readLine());
		}
		fr.close();
		br.close();
	} catch (Exception e) {
		System.out.println("chek code");
	}
	}
}
