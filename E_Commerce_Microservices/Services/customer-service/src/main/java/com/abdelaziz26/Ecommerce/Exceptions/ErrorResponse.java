package com.abdelaziz26.Ecommerce.Exceptions;

import lombok.AllArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor

public class ErrorResponse {

    private Map<String, String> errors = new HashMap<String, String>();
}
