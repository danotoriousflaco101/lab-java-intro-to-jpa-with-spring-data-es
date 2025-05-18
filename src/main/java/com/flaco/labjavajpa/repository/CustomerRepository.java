package com.flaco.labjavajpa.repository;

import com.flaco.labjavajpa.entity.Customer;
import com.flaco.labjavajpa.entity.CustomerStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByStatus(CustomerStatus status);
    List<Customer> findByTotalMileageGreaterThan(Integer mileage);
}