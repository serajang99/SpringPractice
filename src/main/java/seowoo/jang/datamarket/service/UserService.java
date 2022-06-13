package seowoo.jang.datamarket.service;

import org.springframework.stereotype.Service;
import seowoo.jang.datamarket.model.UserDto;
import seowoo.jang.datamarket.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDto getUserById(Integer id) {
        return this.userRepository.findById(id);
    }

    public List <UserDto> getAllUsers() {
        return this.userRepository.findAll();
    }

    public Integer join(UserDto user) {
        return this.userRepository.insertUser(user);
    }
}
