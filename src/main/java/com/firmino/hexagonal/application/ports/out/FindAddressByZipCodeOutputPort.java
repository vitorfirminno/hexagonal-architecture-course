package com.firmino.hexagonal.application.ports.out;

import com.firmino.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);

}
