package Com.Pkg.PT;

public class PTonForM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
long startTime= System.currentTimeMillis();
int x=10000000, i=1;
while(i<=x) {
	System.out.println(i);
	i++;
	}
long endTime =System.currentTimeMillis();
System.out.println(endTime-startTime);
}
}