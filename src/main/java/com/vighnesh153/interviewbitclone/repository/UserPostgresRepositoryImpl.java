package com.vighnesh153.interviewbitclone.repository;

import com.vighnesh153.interviewbitclone.models.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgres")
public class UserPostgresRepositoryImpl implements UserRepository {
    private final List<User> usersDB = new ArrayList<>();

    @Override
    public User createUser(User user) {
        User createdUser = new User(user.getName(), user.getGender());
        usersDB.add(createdUser);
        return createdUser;
    }

    @Override
    public Optional<User> getUser(UUID id) {
        return usersDB.stream()
                .filter(user -> user.getUuid().equals(id))
                .findFirst();
    }
}
