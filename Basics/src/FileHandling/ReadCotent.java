package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class ReadCotent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="";
int vcount=0, scount=0;
try
{
	FileReader fr=new FileReader("//home//prakash//Documents//Abc.txt");
		int i=0;
		while((i=fr.read())!=-1) {
		//	System.out.println(i);
			char ch=(char)i;
if	((ch=='A')||(ch=='a')||(ch=='E')||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u') {
	vcount++;
}

if(ch == ' ')
{
	scount=scount+1;
}


			s=s+(char)i;
		}
		fr.close();
	}
catch(IOException e) {
//	e.printStackTrace();
//	System.out.println(e);
	System.out.println("check code");
}
System.out.println(s);
System.out.println(s.length());
System.out.println(scount);
System.out.println(vcount);
System.out.println(s.length()-vcount-scount);

}
}