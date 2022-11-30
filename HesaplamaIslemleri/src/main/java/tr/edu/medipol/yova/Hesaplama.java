package tr.edu.medipol.yova;

public class Hesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hesaplama h = new Hesaplama();
		long toplama = h.toplama(42, 28);
		long cikarma = h.cikarma(33, 2);
		long carpma = h.carpma(50, 2);
		long bolme = h.bolme(20, 4);
		System.out.println(toplama);
		System.out.println(cikarma);
		System.out.println(carpma);
		System.out.println(bolme);
		
	}
	
	long toplama(int sayi1, int sayi2) {
		long sonuc =(long) sayi1 + sayi2;
		return sonuc;
	}
	
	int cikarma(int sayi1, int sayi2) {
		int sonuc = sayi1 - sayi2;
		return sonuc;
	}
	
	int carpma(int sayi1, int sayi2) {
		int sonuc = sayi1 * sayi2;
		return sonuc;
	}
	
	int bolme(int sayi1, int sayi2) {
		int sonuc = sayi1 / sayi2;
		return sonuc;
	}
}
