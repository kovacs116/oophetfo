
public class pi_erteke {
	public static void main(String[] args) {
		//Wallis-formula
		double pi = 1;
		double elso, masodik, valospi;
		int darab = 100000;
		for (int i = 1; i<= darab; i++){
			elso = (i*2.0)/(2*i-1);
			masodik = (i*2.0)/(2*i+1);
			pi *= elso*masodik;
		}
		valospi = pi*2;
		System.out.println("pi erteke: " + valospi);
		// Leibniz- féle sor
		pi = 0;
		darab *= 4;
		int elojel = 1;
		for (int i = 1; i <= darab; i+=2){
			pi += elojel * 1.0 / i;
			elojel *= -1;
	}
		System.out.println("pi erteke: " + pi*4);
		
		int faktor = 1;
		for ( int i = 1; i <= 30; i++){
			faktor *= i;
		}
		System.out.println("30!=" + faktor);
	}

}
