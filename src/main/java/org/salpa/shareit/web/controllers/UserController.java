package org.salpa.shareit.web.controllers;

import org.salpa.shareit.dto.user.UserCreateDto;
import org.salpa.shareit.dto.user.UserReadDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    public UserReadDto createUser(@RequestBody UserCreateDto createDto) {
        return null;
    }
}
