package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
// kendisinden ba�ka b�l�nd��� say�lar�n toplam� kendisini veriyorsa bu say� m�kemmel say�d�r.

// �rne�in 6 -> 1, 2, 3 -> 1+2+3=6 & 28 -> 1, 2, 4, 7, 14 -> 1+2+4+7+14=28

		int number = 28;
		int total = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = total + i;
			}
		}
		if (total == number) {
			System.out.println("M�kemmel say�d�r");
		} else {
			System.out.println("M�kemmel say� de�ildir");
		}

	}
}
