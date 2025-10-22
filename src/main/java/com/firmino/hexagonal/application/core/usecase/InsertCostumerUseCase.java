package com.firmino.hexagonal.application.core.usecase;

import com.firmino.hexagonal.application.core.domain.Costumer;
import com.firmino.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.firmino.hexagonal.application.ports.out.InsertCostumerOutputPort;

public class InsertCostumerUseCase {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final InsertCostumerOutputPort insertCostumerOutputPort;

    public InsertCostumerUseCase(FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort, InsertCostumerOutputPort insertCostumerOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCostumerOutputPort = insertCostumerOutputPort;
    }

    public void Insert(Costumer costumer, String zipCode){
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        costumer.setAddress(address);
        insertCostumerOutputPort.insert(costumer);
    }
}
