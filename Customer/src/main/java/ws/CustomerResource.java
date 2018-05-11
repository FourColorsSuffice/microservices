package ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerResource {

    @Autowired
    private CustomerReposity customerReposity;

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerReposity.findAll();
    }

    @GetMapping("/customers/{id}")
    public Customer getCustomer(@PathVariable int id) {
        Optional<Customer> customer = customerReposity.findById(id);
        return customer.get();
    }

    @PostMapping("/customers")
    public void createCustomer(@RequestBody Customer customer) {
        Customer savedCustomer = customerReposity.save(customer);
    }

    @PutMapping("/customers/{id}")
    public void updateCustomer(@RequestBody Customer customer, @PathVariable int id) {
        Optional<Customer> a = customerReposity.findById(id);

        customer.setId(id);
        customerReposity.save(customer);
    }

    @DeleteMapping("/customers/{id}")
    public void deleteCustomer(@PathVariable int id) {
        customerReposity.deleteById(id);
    }

}
