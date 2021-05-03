import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Date;

public class Main {

    public static void  main(String [] args){


        BaseCustomerManager customerManager= new NeroCustomerManager();
        Customer customer=new Customer().setDateOfBirth(new Date(1986,04,04))
                                        .setFirstName("Durna")
                                        .setLastName("Hasanova")
                                        .setId(1)
                                        .setNationalityId("1234567");


    }



}
