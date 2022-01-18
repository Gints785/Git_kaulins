import java.util.Random;
import java.util.Scanner;

public class kaulins {
	static void mestkaulinu(int reizes){
		Random rand = new Random();
		
		int skaitli;
		for(int i=1;i<=reizes;i++){
		skaitli = rand.nextInt(6)+1;
		System.out.println("Uzkrita : "+skaitli);
		}
	}
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("cik reizes mest kaulinu");
		int reizes = scan.nextInt();
		mestkaulinu(reizes);
	
		scan.close();
	}
}
		
		
	
		

	
