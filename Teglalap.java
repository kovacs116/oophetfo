
public class Teglalap {

		private int a_oldal;
		private int b_oldal;
		
		public Teglalap(int a_oldal, int b_oldal) {
			setOldalak ( a_oldal, b_oldal );
		}
		
		public Teglalap (int oldalhossz) {
			setOldalak ( oldalhossz );
		}
		
		public int Terulet(){
			return a_oldal*b_oldal;
		}
		public String toString(){
			return a_oldal  + "," + b_oldal + "," + Terulet();
		}
		
		public void setOldalak ( int a_oldal, int b_oldal ){
			this.a_oldal = a_oldal;
			this.b_oldal = b_oldal;
			
		}
		public void setOldalak( int oldalhossz ){
			this.a_oldal = oldalhossz;
			this.b_oldal = oldalhossz;
		}
		public boolean teruletNagyobbMint( Teglalap masikTeglalap){
			return Terulet() > masikTeglalap.Terulet();
		}
		
		public boolean egyezikE( Teglalap masikTeglalap){
			return a_oldal == masikTeglalap.a_oldal && b_oldal == masikTeglalap.b_oldal;
		}
}
