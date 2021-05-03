package Abstract;

import Entities.Customer;

public abstract  class BaseCustomerManager implements ICustomer {
    @Override
    public void Save(Customer customer) throws Exception {
        System.out.println("Veri tabanina kaydedildi");
    }
}
