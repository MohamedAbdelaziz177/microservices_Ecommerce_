package com.abdelaziz26.Ecommerce.Customer;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import jdk.jfr.DataAmount;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Document(collection = "customers")
public class Customer {

    @Id
    private String id;

    @Field(name = "first-name", write = Field.Write.NON_NULL)
    private String firstName;

    @Field(name = "last-name", write = Field.Write.NON_NULL)
    private String lastName;

    @Indexed(unique = true)
    @Email
    private String email;

    @Valid
    private Address address;
}
