import java.util.Scanner;
public class Seasons {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month Number: ");
		int month = sc.nextInt();
		printSeason(month);
		sc.close();
	}
	
	public static void printSeason(int month) {
		switch (month) {
		case 1, 2, 12: System.out.println("Winter");    
		break;
		case 3, 4, 5: System.out.println("Spring");
		break;
		case 6, 7, 8: System.out.println("Summer");
		break;
		case 9, 10, 11: System.out.println("Autumn");
		break;
		default: System.out.println("Invalid Entry");
		}
	}
}

/* We can use multiple values to print one statement by using ',' or we can create multiple cases 
eg: case 1:
    case 2:
    case 12: System.out.println("Winter");
*/
