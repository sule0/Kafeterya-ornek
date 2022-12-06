
public class Kasa {
	double toplamSatis = 0;
	double gunlukKar;
	double salataKar;
	int tatliSayisi;
	int salataSayisi;

	public Kasa() {

	}

	public Kasa(String isim) {
		System.out.println("Hos geldin!" + isim);

	}

	public void hesapla(int secim, double fiyat) {
		topSatHesapla(fiyat);
		gunlukKrHesapla(secim, fiyat);

	}

	private void topSatHesapla(double fiyat) {
		toplamSatis += fiyat;

	}

	private void gunlukKrHesapla(int secim, double fiyat) {
		double kar = 0;
		if (secim == 1) {

			kar = fiyat * 0.3;

			salataKari(kar);
		}
		if (secim == 2) {

			kar = fiyat * 0.25;
		}
		if (secim == 3) {

			kar = fiyat * 0.35;
		}
		if (secim == 4) {
			tatliSayisiArttir();

			kar = fiyat * 0.2;
		}
		gunlukKar += kar;
		

	}

	private void salataKari(double kar) {
		salataKar+=kar;

	}

	private void tatliSayisiArttir() {
		tatliSayisi += 1;

	}

	public void fisYazdir() {
		
		System.out.println("Gunluk kar ="+gunlukKar);
		System.out.println("Ortalama salata kari= "+salataKar);
		System.out.println("Tatli sayisi= "+tatliSayisi);
		System.out.println("Toplam satis= "+toplamSatis);

	}
}
