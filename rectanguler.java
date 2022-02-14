package rectangular;
import java.util.Scanner;
public class rectanguler {
	
public static void main ( String []args) {
	Scanner input = new Scanner ( System.in);
	
	int a;
	
	
	System.out.println(" Enter the lenth:");
	int l = input.nextInt();
	System.out.println(" Enter the width:");
	int w = input.nextInt();
	
	a = l * w;
	
	System.out.println(" The rectanguler area = "+ a);
}
}
