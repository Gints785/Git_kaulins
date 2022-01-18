import java.util.Random;

public class kaulins {
	static void mestkaulinu(){

	
		
		int skaitli;
		Random rand = new Random();
		
		skaitli = rand.nextInt(6)+1;
		System.out.println("Uzkrita : "+skaitli);

	}
		
		
	public static void main(String[] args) {
		mestkaulinu();
	}

}
