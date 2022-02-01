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
		int reizes;
		do{
		System.out.println("cik reizes mest kaulinu");
		reizes = scan.nextInt();
		}while(reizes<1);
		mestkaulinu(reizes);
	
		scan.close();
	}
}
		
		
	
		

	
