package abstractClasses;

public abstract class GameCalculator {
//base class
	
	public abstract void hesapla();
	
	public final void gameOver() {
		System.out.println("Oyun Bitti!");
	}
}
