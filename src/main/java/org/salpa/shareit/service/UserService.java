package org.salpa.shareit.service;

import lombok.RequiredArgsConstructor;
import org.salpa.shareit.dto.user.UserCreateDto;
import org.salpa.shareit.dto.user.UserReadDto;
import org.salpa.shareit.entity.User;
import org.salpa.shareit.exception.NotFoundException;
import org.salpa.shareit.exception.ValidationException;
import org.salpa.shareit.mapper.UserMapper;
import org.salpa.shareit.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    private final UserMapper mapper;

    public UserReadDto createUser(UserCreateDto createDto) {
        User user = mapper.toUser(createDto);
        validate(user);
        userRepository.save(user);
        return mapper.toReadDto(user);
    }

    private void validate(User user) {
        if (user == null)
            throw new NotFoundException("User not found");

        String name = user.getName();
        if (name == null || name.isBlank())
            throw new ValidationException("User name error");

        String email = user.getEmail();
        if (email == null || email.isBlank() || email.contains(" ") || !email.contains("@"))
            throw new ValidationException("User email error");
    }
}
