package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);

		System.out.println("Eleman sayýsý: " + mesaj.length());

		System.out.println("Beþinci eleman: " + mesaj.charAt(4)); // 4. harf hangisi?

		System.out.println(mesaj.concat(" Yaþasýn!")); // mesaj sonuna yeni kelimeyi ekliyor

		System.out.println(mesaj.startsWith("B")); // B ile mi baþlýyor?

		System.out.println(mesaj.endsWith(".")); // Nokta ile mi bitiyor?

		char[] karakterler = new char[5];

		mesaj.getChars(0, 5, karakterler, 0);

		System.out.println(karakterler);

		System.out.println(mesaj.indexOf('a')); // a kaçýncý eleman? ilk bulduðu a'yý yazar.

		System.out.println(mesaj.indexOf("av"));

		System.out.println(mesaj.lastIndexOf("a")); // sondan

		System.out.println(mesaj.replace(' ', '-')); // boþluklar yerine - iþareti koyuyor.

		System.out.println(mesaj.substring(2, 5)); // 2-5 index arasý yazdýrýyor.

		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime); // kelimeleri ayrý ayrý alt alta yazdýrýyor.
		}

		System.out.println(mesaj.toLowerCase()); // bütün harfleri küçük yapýyor.

		System.out.println(mesaj.toUpperCase()); // bütün harfleri büyük yapýyor.

		System.out.println(mesaj.trim()); // mesajýn baþýndaki ve sonundaki boþluklarý atýyor.

	}

}
