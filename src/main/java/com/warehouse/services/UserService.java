package com.warehouse.services;

import com.warehouse.entity.User;
import com.warehouse.repository.UserRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    public void save(User user) {
        userRepository.save(user);
    }

    public User get(Long id) throws UserNotFoundException {
        Optional<User> result = userRepository.findById(id);
        if (result.isPresent()) {
            return result.get();
        }
        throw new UserNotFoundException("Couldn't found the user.");
    }

    public void delete(Long id) throws UserNotFoundException {
        Long count = userRepository.count();
        userRepository.deleteById(id);

        if (count == null || count == 0) {
            throw new UserNotFoundException("User's not found.");
        }
    }
}
