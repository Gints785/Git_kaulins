import java.util.Random;
import java.util.Scanner;

public class kaulins {
	static void mestkaulinu(int reizes){
		Random rand = new Random();
		
		int skaitlis, lielakais=0;
		for(int i=1;i<=reizes;i++){
			skaitlis = rand.nextInt(6)+1;
		System.out.println("Uzkrita : "+skaitlis);
		if(lielakais < skaitlis){
			lielakais = skaitlis;
		}
		}
		System.out.println("Lielakais skaitlis metienu reize ir "+lielakais);
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
		
		
	
		

	
