/*
	College Trip
 
	North Karnataka students planned a class trip to South Karnataka places. Students were very excited about the trip. They made a list of place that they wanted to visit. After a big discussion between the students, they shortlisted 3 best places: Madekeri, Mysore and Mangalore. Now Class leader Ram is confused about the location of the trip.
	 


	So he decided to conduct voting to select the place. Students agreed with this option.
	Students who want to go Madikeri should vote 1, for Mysore vote 2 and for Mangalore they should vote 3.
	The place which got highest votes will be the trip location. He also warned them that, if more than one place got same highest number of votes then the trip will be cancelled.
	Help Ram to decide the place by wiriting a program.

	Input format:
	1st input is an integer, which indicates the Number of students, 'n'.
	Next 'n' lines of inputs indicates votes( either 1,2 or 3).

	Output format:
	First line of the output is the number of votes for 'Madikeri'.
	Second line of the output is the number of votes for 'Mysore'.
	Third line of the output is the number of votes for 'Mangalore'.
	Fourth line of the output is the number of invalid votes.
	Fifth line of the output consist of a string that indicates the location of the trip or "Trip cancelled".

	Sample Input1:
	5
	1
	1
	3
	3
	3
	Sample Output 1:
	2
	0
	3
	0
	Mangalore

	Sample input2:
	12
	1
	1
	3
	3
	3
	2
	2
	1
	1
	1
	3
	3
	Sample Output 2:
	5
	2
	5
	0
	Trip cancelled
*/



import java.util.Scanner;

class CollegeTrip {
	public static void main(String args[]) {
		
		byte countIndex = 0, studentsCount;
		byte[] votes = new byte[4];
		int[] votesPercentage = new int[3];
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("\n\tEnter Number of Students : ");
		try {
			studentsCount = sc.nextByte();
		} catch (Exception e) {
			studentsCount = 0;
			System.out.println("\n\tEnter Numbers only.");
		}
		
		while (countIndex < studentsCount) {
			System.out.print("\n\t1) Mangalore, 2) Mysore 3) Madekeri \t");
			
			try {
				votes[0] = sc.nextByte();
				
				if(votes[0] == 1) {
					System.out.println("\nYou have voted for Mangalore");				
					votes[1]++;
					countIndex++;
				} else if(votes[0] == 2) {
					System.out.println("\nYou have voted for Mysore");				
					votes[2]++;
					countIndex++;
				} else if(votes[0] == 3) {
					System.out.println("\nYou have voted for Madekeri");				
					votes[3]++;
					countIndex++;
				} else {
					System.out.println("\nInvalid Vote");		
				}
			} catch (Exception e) {
				System.out.println("\n\tEnter Numbers only.");
			}
		}
		
		votesPercentage[0] = (votes[1] * 100) / studentsCount;
		votesPercentage[1] = (votes[2] * 100) / studentsCount;
		votesPercentage[2] = (votes[3] * 100) / studentsCount;
		
		System.out.println("\n\tTotal Votes for 1) Mangalore : " + votes[1] + " ie) " + votesPercentage[0] + " %");
		System.out.println("\n\tTotal Votes for 2) Mysore : " + votes[2] + " ie) " + votesPercentage[1] + " %");
		System.out.println("\n\tTotal Votes for 3) Madekeri : " + votes[3] + " ie) " + votesPercentage[2] + " %");
		
		if(votes[1] > votes[2] && votes[1] > votes[3])
			System.out.println("\n\tTour Locked for Mangalore.");
		else if(votes[2] > votes[3] && votes[2] > votes[1])
			System.out.println("\n\tTour Locked for Mysore.");
		else if(votes[3] > votes[2])
			System.out.println("\n\tTour Locked for Madekeri.");
		else 
			System.out.println("\nTour Cancelled");
		
		sc.close();
	}
}
