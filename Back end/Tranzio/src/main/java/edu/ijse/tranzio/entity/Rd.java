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
public class Rd {
    @Id
    private String rdNumber;
    private String rdName;
    private String startTime;
    private String endTime;
}
