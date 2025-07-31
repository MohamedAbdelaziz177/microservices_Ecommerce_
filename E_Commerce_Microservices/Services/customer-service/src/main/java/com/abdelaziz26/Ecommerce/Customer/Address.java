package com.abdelaziz26.Ecommerce.Customer;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import org.springframework.validation.annotation.Validated;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Address {

    @NotBlank
    private String street;

    @NotBlank
    private String city;

    @NotBlank
    private String state;

    @Pattern(regexp = "^[0-9]{5}(?:-[0-9]{4})?$")
    private String zip;
}
