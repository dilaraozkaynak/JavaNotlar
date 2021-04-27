package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bug�n hava �ok g�zel.";
		System.out.println(mesaj);

		System.out.println("Eleman say�s�: " + mesaj.length());

		System.out.println("Be�inci eleman: " + mesaj.charAt(4)); // 4. harf hangisi?

		System.out.println(mesaj.concat(" Ya�as�n!")); // mesaj sonuna yeni kelimeyi ekliyor

		System.out.println(mesaj.startsWith("B")); // B ile mi ba�l�yor?

		System.out.println(mesaj.endsWith(".")); // Nokta ile mi bitiyor?

		char[] karakterler = new char[5];

		mesaj.getChars(0, 5, karakterler, 0);

		System.out.println(karakterler);

		System.out.println(mesaj.indexOf('a')); // a ka��nc� eleman? ilk buldu�u a'y� yazar.

		System.out.println(mesaj.indexOf("av"));

		System.out.println(mesaj.lastIndexOf("a")); // sondan

		System.out.println(mesaj.replace(' ', '-')); // bo�luklar yerine - i�areti koyuyor.

		System.out.println(mesaj.substring(2, 5)); // 2-5 index aras� yazd�r�yor.

		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime); // kelimeleri ayr� ayr� alt alta yazd�r�yor.
		}

		System.out.println(mesaj.toLowerCase()); // b�t�n harfleri k���k yap�yor.

		System.out.println(mesaj.toUpperCase()); // b�t�n harfleri b�y�k yap�yor.

		System.out.println(mesaj.trim()); // mesaj�n ba��ndaki ve sonundaki bo�luklar� at�yor.

	}

}
