package edu.ijse.tranzio.service.impl;

import edu.ijse.tranzio.dto.LoginDto;
import edu.ijse.tranzio.dto.SignUpDto;
import edu.ijse.tranzio.dto.TranzioResponseDto;
import edu.ijse.tranzio.entity.Role;
import edu.ijse.tranzio.entity.User;
import edu.ijse.tranzio.repository.UserRepository;
import edu.ijse.tranzio.service.UserService;
import edu.ijse.tranzio.util.JwtUtil;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    @Override
    public String save(SignUpDto signUpDto) {
        if (userRepository.findByUsername(signUpDto.getUsername()).isPresent()) {
            throw new RuntimeException("User is already");
        }

        User user=User.builder()
                .username(signUpDto.getUsername())
                .password(passwordEncoder.encode(signUpDto.getPassword()))
                .role(Role.valueOf(signUpDto.getRole()))
                .build();
        userRepository.save(user);
        return "User Signup complete";
    }

    @Override
    public TranzioResponseDto login(LoginDto loginDto) {

       User user = userRepository.findByUsername(loginDto.getUserName()).orElseThrow(()->new RuntimeException("User not found"));
       if (!passwordEncoder.matches(loginDto.getPassword(), user.getPassword())) {
           throw new BadCredentialsException("Invalid credentials");
       }
       String token=jwtUtil.generateToken(loginDto.userName);
       return new  TranzioResponseDto(token);
    }
}
