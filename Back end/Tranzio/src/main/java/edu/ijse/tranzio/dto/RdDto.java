package edu.ijse.tranzio.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RdDto {
    private String rdNumber;
    private String rdName;
    private String startTime;
    private String endTime;
}
