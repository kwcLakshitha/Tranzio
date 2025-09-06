package edu.ijse.tranzio.controller;

import edu.ijse.tranzio.dto.ApiResponse;
import edu.ijse.tranzio.dto.LoginDto;
import edu.ijse.tranzio.dto.SignUpDto;
import edu.ijse.tranzio.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tranzio")
@Slf4j
public class UserController {

    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<ApiResponse> signUp(@RequestBody SignUpDto signUpDto) {
        log.info("create account");
        return ResponseEntity.ok(
                new ApiResponse(
                        200,
                        "User Signup complete",
                        userService.save(signUpDto)
                )
        );
    }
    @PostMapping("/login")
    public ResponseEntity<ApiResponse> login(@RequestBody LoginDto loginDto) {
        log.info("welcome");
        return ResponseEntity.ok(
                new ApiResponse(
                        200,
                        "ok",
                        userService.login(loginDto)
                )
        );
    }
}
