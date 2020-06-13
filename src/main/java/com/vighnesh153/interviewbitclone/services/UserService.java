package com.vighnesh153.interviewbitclone.services;

import com.vighnesh153.interviewbitclone.models.User;
import com.vighnesh153.interviewbitclone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    // Handles creation, updates, deletion or the User in DB

    private final UserRepository userRepository;

    @Autowired
    public UserService(@Qualifier("postgres") UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.createUser(user);
    }

    public User getUser(UUID id) {
        Optional<User> foundUser = userRepository.getUser(id);
        return foundUser.isEmpty() ? null : foundUser.get();
    }
}
