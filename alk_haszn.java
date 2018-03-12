
public class alk_haszn {


	public static void main(String[] args) {
		alkalmazott Alkalmazott =new alkalmazott();

		//Alkalmazott.nev = " Kovács Alex";
		//Alkalmazott.fizetes = 500;
		Alkalmazott.setNev("Kiss József");
		Alkalmazott.setFizetes(20);
		
		//System.out.println(Alkalmazott.nev);
		//System.out.println(Alkalmazott.toString());
		//System.out.println(Alkalmazott.fizetes);
		//Alkalmazott.fizetes_noveles(5);
		//System.out.println(Alkalmazott);
		System.out.println(Alkalmazott.getNev());
		System.out.println(Alkalmazott.getFizetes());
		System.out.println(Alkalmazott.fizetes_intervallumok_kozt(25, 30));
		System.out.println(Alkalmazott.ado);
		
		alkalmazott masik = new alkalmazott();
		masik.setFizetes(10);
		masik.setNev("Kiss Klaudia");
		
		System.out.println(Alkalmazott.nagyobb_fizetesu_mint(masik));
		
		alkalmazott[] Alkalmazottak = new alkalmazott[5];
		
		
		//for(int i = 0; i < Alkalmazottak.length; i++ ){
			//Alkalmazottak[i] = new alkalmazott();
			//Alkalmazottak[i].setNev("A");
			//Alkalmazottak[i].setFizetes((long)Math.random() * 50 + 1);
			//System.out.println(Alkalmazottak[i]);
			//Alkalmazott.max = Alkalmazottak[0].getNev();
			//Alkalmazott.max_ertek = Alkalmazottak[0].getFizetes();
			//if ( Alkalmazottak[i].getFizetes < Alkalmazott.max_ertek ) {
				//Alkalmazott.max_ertek = Alkalmazottak[i].getFizetes();
				//Alkalmazott.max = Alkalmazottak[0].getNev();
				//}
			//}
			
		}
		
	}


