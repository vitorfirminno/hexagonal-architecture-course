package com.firmino.hexagonal.application.ports.out;

import com.firmino.hexagonal.application.core.domain.Costumer;

public interface InsertCostumerOutputPort {

    void insert(Costumer costumer);

}
