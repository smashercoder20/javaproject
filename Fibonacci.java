import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
int n1= 0;
int n2 = 1;
//int n3 = n1 + n2;
System.out.println("ENTER YOUR NUMBER");
int count =  sc.nextInt();
System.out.print(n1+" "+n2);

for(int i = 2;i<count;++i) {
	int n3 = n1 + n2;
	System.out.print(" "+n3);
	n1=n2;
	n2=n3;
	
}

	}
	 
	 

	}


