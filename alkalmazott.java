
public class alkalmazott {

	private String nev;
	private long fizetes;
	public long ado, max_ertek;
	public String max;
	
	public void fizetes_noveles (long ertek)
	{
		fizetes += ertek;
	}
	
		
	public String toString(){
		return "Alkalmazott neve:" + nev + ", fizetese:" + fizetes + "Ft"; 
	}

	public boolean fizetes_intervallumok_kozt(long alsohatar, long felsohatar)
	{
		return  fizetes >= alsohatar &&
				fizetes <= felsohatar;
	}

	public String getNev() {
		return nev;
	}

	public long fizetendo_ado(){
		return (long)(fizetes * 0.16);
	}
	

	public void setNev(String nev_parameter) {
		nev = nev_parameter;
	}


	public long getFizetes() {
		return fizetes;
	}


	public void setFizetes(long fizetes) {
		this.fizetes = fizetes;
	}
	
	public boolean nagyobb_fizetesu_mint(alkalmazott masik){
		return fizetes > masik.fizetes;
	}

}
