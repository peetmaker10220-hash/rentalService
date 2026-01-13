package th.co.scb.ngage.service;

import org.springframework.stereotype.Service;
import th.co.scb.ngage.repository.UserRepository;
import th.co.scb.ngage.model.common.User;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Object getAllUsers() {
        return userRepository.findAll();
    }

    public Object saveUser(User user) {
        return userRepository.save(user);
    }
}
