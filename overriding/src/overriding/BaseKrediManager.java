package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
}

//overridable = üzerine yazılabilir.
//public final yaparsak hesapla operasyonu override edilemez hale gelir.
//public final double hesapla(double tutar) {
//	return tutar * 1.18;
//}