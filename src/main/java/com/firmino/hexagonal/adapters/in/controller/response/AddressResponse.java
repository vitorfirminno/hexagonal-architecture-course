package com.firmino.hexagonal.adapters.out.client.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AddressResponse {

    private String street;

    private String city;

    private String state;

}
