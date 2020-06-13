package com.vighnesh153.interviewbitclone.controllers;

import com.vighnesh153.interviewbitclone.dto.ResponseDto;
import com.vighnesh153.interviewbitclone.models.User;
import com.vighnesh153.interviewbitclone.services.UserService;
import com.vighnesh153.interviewbitclone.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(Constants.EndPoints.USERS)
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("{id}")
    public ResponseDto<User> getUser(@PathVariable UUID id) {
        User serviceResponse = userService.getUser(id);
        if (serviceResponse == null) {
            return new ResponseDto<>(HttpStatus.NOT_FOUND, null);
        }
        return new ResponseDto<>(HttpStatus.FOUND, serviceResponse);
    }
}
