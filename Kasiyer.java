import java.util.Scanner;

public class Kasiyer {
	int secim;
	double fiyat;
		Kasa a = new Kasa();
	
	public Kasiyer() {

	}

	public Kasiyer(String isim) {
		Kasa kasa = new Kasa(isim);

	}

	public void isVakti() {

		System.out.println("Yiyecek kodunu seciniz: ");
		System.out.println("1-> Salata");
		System.out.println("2-> Hamburger");
		System.out.println("3-> Pizza");
	    System.out.println("4-> Tatli");

	

		Scanner klavye = new Scanner(System.in);
		 secim = klavye.nextInt();

		if (secim != 5) {
			
			System.out.println("Fiyati giriniz: ");
			double fiyat = klavye.nextDouble();
			a.hesapla(secim,fiyat);
			isVakti();
		} else {
			a.fisYazdir();
			System.exit(0);
		}

		
		
	}

}
