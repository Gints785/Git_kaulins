import java.util.Random;

public class kaulins {
	static void mestkaulinu(int reizes){

	
		
		
		Random rand = new Random();
		for(int i=1;i<=reizes;i++){
		int skaitli = rand.nextInt(6)+1;
		System.out.println("Uzkrita : "+skaitli);

	}
	}	
		
	public static void main(String[] args) {
		mestkaulinu(3);
	}

}
