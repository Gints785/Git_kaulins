import java.util.Random;
import java.util.Scanner;

public class kaulins {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("cik reizes mest kaulinu");
		int reizes = scan.nextInt();
		int skaitli;
		for(int i=1;i<=reizes; i++){
		skaitli = rand.nextInt(6)+1;
		System.out.println("Uzkrita : "+skaitli);
		}
		scan.close();
	}

}
