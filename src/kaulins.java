import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class kaulins {
	static int mestkaulinu(){
		Random rand = new Random();		
		int skaitli;
		skaitli = rand.nextInt(6)+1;
		return skaitli;
		
	}
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int reizes, izvele, lielakais=0;
		List<Integer> pedejie = new ArrayList<Integer>();
		
		do{
			
		System.out.println("1-Mest kaulinu | 2-apkatit pedejo metienu" + "|3-apskatit llielako \4-apturet");
		izvele = scan.nextInt();
		switch(izvele){
		case 1: 
			do{
				System.out.println("cik reizes mest?");
				reizes = scan.nextInt();
			
			}while(reizes<1);
			for(int i=0; i<reizes; i++){
				pedejie.add(mestkaulinu());
			}
		break;
		
		case 2:
			System.out.println("pedeja metiena sk ir ");
			for(Integer i : pedejie){
				System.out.print(i+" ");
				
			}
			System.out.println();
			break;
		case 3:
			for(int i=0; i<pedejie.size(); i++){
				if(pedejie.get(i)>lielakais){
					lielakais = pedejie.get(i);
				}
			}
		break;
		case 4:
			System.out.println("aptureta ");
			break;
		
		}
		
		
		}while(izvele!=4);
		
		
	
		scan.close();
	}
}
		
		
	
		

	
