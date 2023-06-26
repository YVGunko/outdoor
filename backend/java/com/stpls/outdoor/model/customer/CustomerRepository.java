package com.stpls.outdoor.model.customer;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

// tag::code[]
public interface CustomerRepository extends PagingAndSortingRepository<Customer, String> {// <1>
	Page<Customer> findByNameContaining(String name, Pageable pageable);
}
// end::code[]
