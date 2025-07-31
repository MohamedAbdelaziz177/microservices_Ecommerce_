package com.abdelaziz26.Ecommerce.Customer;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CustomerResponse {

    private String id;

    private String firstName;

    private String lastName;

    private String email;

    private String city;

    private String state;
}
