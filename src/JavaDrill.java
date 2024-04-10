import java.util.Scanner;

public class JavaDrill {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		JavaDrill jd = new JavaDrill();
		
		
		// Circle area
		System.out.println(jd.circleArea(5));
		System.out.println("\n\n");
		//Reverse a String
		System.out.println("Enter a word");
		String word = sc.nextLine();
		jd.reverseString(word);
		
	}
	public double circleArea(int radius) {
		double area = (radius * radius) * Math.PI;
		return area;
	}
	
	public void reverseString(String word) {
		StringBuilder sb = new StringBuilder(word).reverse();	
		System.out.println(sb);
	}
}
