package edu.ijse.tranzio.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BusDto {
    private String numberPlate;
    private String busName;
    private String rdNumber;
    private String DriverId;
}
