package com.SENA.FlightManagementSystem.Flight.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponseDto<T> {
    private String message;
    private T data;
    private boolean success;
}
