import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int patternNumber = sc.nextInt();
        
        for(int i = 1; i <= patternNumber; i++) {
           char design[] = new char[patternNumber];
            if(i % 2 == 1) {
                for(int j = 0; j < patternNumber; j++)
                    if(j % 2 == 0)
                        design[j] = '*';
                    else
                        design[j] = '_';
            } else {
                for(int j = 0; j < patternNumber; j++)
                    if(j % 2 == 1)
                        design[j] = '*';
                    else
                        design[j] = '_';
            }
            System.out.println(design);
        }
    }
}
