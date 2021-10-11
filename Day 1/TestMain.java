package Assignment;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the values of point1: ");
		int p1x;
		int p1y;
		p1x = sc.nextInt();
		p1y = sc.nextInt();
		
		point2D p = new point2D(p1x, p1y);
		
		System.out.println(p.getDetails());
		
		System.out.println("Enter the values of point2: ");
		int p2x;
		int p2y;
		
		p2x = sc.nextInt();
		p2y = sc.nextInt();
		
		point2D p2 = new point2D(p2x, p2y);
		
		System.out.println(p2.getDetails());
		
	}

}
