package com.firmino.hexagonal.application.ports.out;

import com.firmino.hexagonal.application.core.domain.Customer;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface FindCostumerByIdOutputPort {

    Optional<Customer> findById(String id);

}
