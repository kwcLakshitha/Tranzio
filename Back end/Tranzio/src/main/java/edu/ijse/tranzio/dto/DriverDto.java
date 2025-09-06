package edu.ijse.tranzio.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DriverDto {
    private String driverId;
    private String driverName;
    private String driverPhone;
    private String driverEmail;
    private String driverNic;
}
