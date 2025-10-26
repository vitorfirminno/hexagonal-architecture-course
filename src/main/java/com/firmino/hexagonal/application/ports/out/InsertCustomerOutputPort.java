package com.firmino.hexagonal.application.ports.out;

import com.firmino.hexagonal.application.core.domain.Customer;

public interface InsertCostumerOutputPort {

    void insert(Customer costumer);

}
