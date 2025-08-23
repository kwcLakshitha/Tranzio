package edu.ijse.tranzio.service.impl;

import edu.ijse.tranzio.entity.User;
import edu.ijse.tranzio.repository.UserRepository;
import edu.ijse.tranzio.service.UserService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
