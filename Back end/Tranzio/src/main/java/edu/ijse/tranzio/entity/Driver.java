package edu.ijse.tranzio.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Driver {

    @Id
    private String driverId;
    private String driverName;
    private String driverPhone;
    private String driverEmail;
    private String driverNic;
}
