package batch.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import batch.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}
