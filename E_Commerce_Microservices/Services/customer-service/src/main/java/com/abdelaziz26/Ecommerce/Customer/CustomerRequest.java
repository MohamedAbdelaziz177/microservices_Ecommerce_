package com.abdelaziz26.Ecommerce.Customer;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerRequest {

    @NotBlank(message = "firstname must have a non-blank value")
    @Size(min = 3, max = 10, message = "firstname size must be between 3 & 10")
    private String firstName;

    @NotBlank(message = "lastname must have a non-blank value")
    @Size(min = 3, max = 10, message = "lastname size must be between 3 & 10")
    private String lastName;

    @Email(message = "email must be a valid email")
    @NotBlank(message = "email field must have a value")
    private String email;

    @NotBlank
    private String street;

    @NotBlank
    private String city;

    @NotBlank
    private String state;

    @Pattern(regexp = "^[0-9]{5}(?:-[0-9]{4})?$")
    private String zip;
}
