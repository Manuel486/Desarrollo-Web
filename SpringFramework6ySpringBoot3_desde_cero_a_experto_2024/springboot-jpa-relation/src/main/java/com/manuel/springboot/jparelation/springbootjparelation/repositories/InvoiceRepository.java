package com.manuel.springboot.jparelation.springbootjparelation.repositories;

import com.manuel.springboot.jparelation.springbootjparelation.entities.Invoice;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceRepository extends CrudRepository<Invoice,Long> {
}
