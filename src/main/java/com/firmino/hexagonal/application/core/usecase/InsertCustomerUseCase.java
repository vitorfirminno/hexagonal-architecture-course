package com.firmino.hexagonal.application.core.usecase;

import com.firmino.hexagonal.application.core.domain.Customer;
import com.firmino.hexagonal.application.ports.in.InsertCustomerInputPort;
import com.firmino.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.firmino.hexagonal.application.ports.out.InsertCostumerOutputPort;

public class InsertCostumerUseCase implements InsertCustomerInputPort {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final InsertCostumerOutputPort insertCostumerOutputPort;

    public InsertCostumerUseCase(FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort, InsertCostumerOutputPort insertCostumerOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCostumerOutputPort = insertCostumerOutputPort;
    }

    @Override
    public void Insert(Customer costumer, String zipCode){
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        costumer.setAddress(address);
        insertCostumerOutputPort.insert(costumer);
    }

}
