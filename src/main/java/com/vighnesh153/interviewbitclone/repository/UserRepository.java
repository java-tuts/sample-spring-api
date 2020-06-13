package com.vighnesh153.interviewbitclone.repository;

import com.vighnesh153.interviewbitclone.models.User;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository {
    User createUser(User user);
    Optional<User> getUser(UUID id);
}
