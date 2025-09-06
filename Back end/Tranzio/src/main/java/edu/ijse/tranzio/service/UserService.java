package edu.ijse.tranzio.service;

import edu.ijse.tranzio.dto.LoginDto;
import edu.ijse.tranzio.dto.SignUpDto;

public interface UserService {
    String save(SignUpDto signUpDto);

    Object login(LoginDto loginDto);
}
