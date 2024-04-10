import java.util.ArrayList;
import java.util.List;
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
		//Find Maximum
		System.out.println("\n\n");
		
		List<Integer> numbers = new ArrayList<>();
		int max = Integer.MIN_VALUE;
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(9);
		numbers.add(81);	
		
		for(int i = 0; i < numbers.size(); i++) {
			if(max < numbers.get(i)) {
				max = numbers.get(i);
			}
			}
		System.out.println(max);
		
		
		
		
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
