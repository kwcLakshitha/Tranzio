package edu.ijse.tranzio.dto;

import lombok.Data;

@Data
public class SignUpDto {
    private String username;
    private String email;
    private String phoneNumber;
    private String password;
    private String role;
}
