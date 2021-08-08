
package eg1;
import java.util.Scanner;
public class Polind {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String arr[]=s.split(" ");
		for(int i=0;i<arr.length;i++) {
		StringBuffer sb=new StringBuffer(arr[i]);
		System.out.print(sb.reverse()+" ");
		}
	}
}
