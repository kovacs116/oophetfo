import java.util.Random;


public class TeglaTomb {


	public static void main(String[] args) {
		
		int meret = 10;;
		Teglalap[] teglatomb = new Teglalap[meret];
		
		for (int i = 0 ; i < meret ; i++){
			teglatomb[i] = new Teglalap((int)(Math.random() * 9) + 2 ,
										(int)(Math.random() * 9) + 2);
			System.out.println(teglatomb[i]);
		}
		
		int min_Teglalap = 0;
		
		for( int i = 1 ; i < meret ; i++){
			if(teglatomb[min_Teglalap].teruletNagyobbMint(teglatomb[i])){
				min_Teglalap = i;
			}
		}
		System.out.println(min_Teglalap);
		
	}

}
