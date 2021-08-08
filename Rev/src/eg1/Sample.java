package eg1;
import java.util.Scanner;
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String arr[]=str.split(" ");
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<arr.length;i++) {
			int k=arr[i].length();
			sb.append(arr[i].substring(0,k-1)).append(Character.toUpperCase(arr[i].charAt(k-1))).append(" ");	
		}
		System.out.println(sb.toString().trim());
	}

}
