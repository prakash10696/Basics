package FileHandling;

import java.io.FileWriter;

public class WriteContent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		FileWriter fw=new FileWriter("//home//prakash//Documents//acc.txt");//true
	String s=" Java is super cool language";
		fw.write(s);
		fw.flush();
		fw.close();
		System.out.println("sucess");
	}
	catch(Exception e)	{
		System.out.println(e);
	}

	}

}
