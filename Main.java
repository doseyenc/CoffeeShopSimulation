import java.util.Date;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		try {
			customerManager.save(new Customer(0, "Ýsim", "Soyisim", new Date(2000, 01, 01), "99999999999"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
