package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadLines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Lcount = 0 ;
		String s = "";
		try {
			FileReader fr = new FileReader("//home//prakash//Documents//bbc.txt");
			BufferedReader br = new BufferedReader(fr);
			while (br.ready()) {
				s = s + br.readLine()+"\n";
				Lcount=Lcount+1;
				//System.out.println(br.readLine());
			}
			fr.close();
			br.close();
		} catch (Exception e) {
			System.out.println("chek code");
		}
		System.out.println(s);
		System.out.println(Lcount);
			
	}

}