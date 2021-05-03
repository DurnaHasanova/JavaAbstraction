package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomer;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksConcreteManager extends BaseCustomerManager  {


    public StarbucksConcreteManager(ICustomerCheckService _customerCheckService) {
        this._customerCheckService = _customerCheckService;
    }

    ICustomerCheckService _customerCheckService;
    @Override
    public void Save(Customer customer) throws Exception {
       if( _customerCheckService.CheckIfRealPerson(customer)){
           super.Save(customer);
       }
       else throw  new Exception("Not a valid Person");

    }



}
