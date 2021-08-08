
package eg1;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=0;
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String arr[]=s.split(" ");
		for(int i=0;i<arr.length;i++) {
			int k=Integer.parseInt(arr[i]);
			if(k==2) {
				System.out.print(arr[i]+" ");
				continue;
			}
			for(j=2;j<(k/2)+1;j++) {
				if(k%j==0) {
					break;
				}
			}
			if(j==(k/2)+1) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
