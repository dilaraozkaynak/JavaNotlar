package interfacesTekrar;

public class CustomerManager {
	private ICustomerDal customerDal;

	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {
		// burada i� kodlar� yaz�l�r.
		customerDal.Add();
	}
}
