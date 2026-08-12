package org.salpa.shareit.web.controllers;

import lombok.RequiredArgsConstructor;
import org.salpa.shareit.dto.user.UserCreateDto;
import org.salpa.shareit.dto.user.UserReadDto;
import org.salpa.shareit.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public UserReadDto createUser(@RequestBody UserCreateDto createDto) {
        return userService.createUser(createDto);
    }
}
