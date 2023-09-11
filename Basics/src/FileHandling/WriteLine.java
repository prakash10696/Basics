package FileHandling;


import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileWriter fw =new FileWriter("//home//prakash//Documents//add.txt ");
		BufferedWriter bw= new BufferedWriter(fw);
			bw.write("Asalt aravind"+"\n");
			bw.write("chandru"+"\n");
			bw.write("saravanan"+"\n");
			bw.close();
		System.out.println("sucees");	
		
		}
catch(Exception e) {
	System.out.println(e);
}
		
	}

}
