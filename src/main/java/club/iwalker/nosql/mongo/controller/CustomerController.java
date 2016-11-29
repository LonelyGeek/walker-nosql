package club.iwalker.nosql.mongo.controller;

import club.iwalker.nosql.mongo.domain.Customer;
import club.iwalker.nosql.mongo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wangchen on 2016/11/29.
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;


    @RequestMapping(value = "/addCustomer", method = RequestMethod.GET)
    public Customer addCustomer(@RequestParam("firstname") String firstname,
                                @RequestParam("secondname") String secondname) {
        Customer customer = new Customer();
        customer.setFirstname(firstname);
        customer.setSecondname(secondname);
        return customerRepository.save(customer);
    }

    @RequestMapping(value = "/getAllCustomer", method = RequestMethod.GET)
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    @RequestMapping(value = "/getCustomerByFirstname", method = RequestMethod.GET)
    public Customer getCustomerByFirstname(@RequestParam("firstname") String firstname) {
        return customerRepository.findByFirstname(firstname);
    }

    @RequestMapping(value = "/getCustomerBySecondname", method = RequestMethod.GET)
    public List<Customer> getCustomerBySecondname(@RequestParam("secondname") String secondname) {
        return customerRepository.findBySecondname(secondname);
    }

    @RequestMapping(value = "/deleteCustomerById", method = RequestMethod.GET)
    public boolean deleteCustomerById(@RequestParam("cid") String cid) {
        customerRepository.delete(cid);
        return true;
    }
}
