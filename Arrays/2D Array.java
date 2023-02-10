import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int patternNumber = sc.nextInt();
	    char[][] design = new char[patternNumber][patternNumber];
		for(int row = 0; row < patternNumber; row++)
		    for(int col = 0; col < patternNumber; col++)
		        if((row + col) % 2 == 0)
		            design[row][col] = '*';
		        else
		            design[row][col] = '_';
		
		for(int row = 0; row < patternNumber; row++) {
		    for(int col = 0; col < patternNumber; col++)
		        System.out.print(design[row][col]);
		    System.out.println();
		}
	}
}
