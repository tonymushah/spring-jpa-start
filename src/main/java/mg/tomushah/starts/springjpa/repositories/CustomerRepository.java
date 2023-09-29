package mg.tomushah.starts.springjpa.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import mg.tomushah.starts.springjpa.classes.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);
    Customer findById(long id);
}
