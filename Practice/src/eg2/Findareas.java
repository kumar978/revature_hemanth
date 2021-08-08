package eg2;
import java.util.*;
public class Findareas extends Area {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Choose:");
		System.out.println("1.Rectangle");
		System.out.println("2.Square");
		System.out.println("3.trianle");
		System.out.println("4.Circle");
		Scanner sb=new Scanner(System.in);
		int a=sb.nextInt();
		Findareas ob=new Findareas();
		switch(a) {
		case 1:
			System.out.print("Enter length : ");
			double l=sb.nextDouble();
			System.out.print("Enter breadth : ");
			double b=sb.nextDouble();
			ob.rectangle(l, b);
			break;
		case 2:
			System.out.println("Enter side : ");
			double s=sb.nextDouble();
			ob.square(s);
			break;
		case 3:
			System.out.println("Enter base : ");
			double base=sb.nextDouble();
			System.out.println("Enter height : ");
			double h=sb.nextDouble();
			ob.triangle(base, h);
			break;
		case 4:
			System.out.println("Enter radius : ");
			double r=sb.nextDouble();
			ob.circle(r);
			break;
		default:
			System.out.println("Enter between 1 t0 4");
		}
		
	}

	@Override
	void rectangle(double len, double bret) {
		// TODO Auto-generated method stub
		System.out.println("Area of rectangle is "+len*bret);
		
	}

	@Override
	void square(double s) {
		// TODO Auto-generated method stub
		System.out.println("Area of Square is "+s*s);
		
	}

	@Override
	void triangle(double b, double h) {
		// TODO Auto-generated method stub
		System.out.println("Area of tringle is "+0.5*b*h);
		
	}

	@Override
	void circle(double r) {
		// TODO Auto-generated method stub
		System.out.println("Area of circle is "+3.14*r*r);
		
	}

}
