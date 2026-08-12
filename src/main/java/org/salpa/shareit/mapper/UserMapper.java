package org.salpa.shareit.mapper;

import org.salpa.shareit.dto.user.UserCreateDto;
import org.salpa.shareit.dto.user.UserReadDto;
import org.salpa.shareit.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User toUser(UserCreateDto dto) {
        return new User(null, dto.getName(), dto.getEmail());
    }
    public User toUser(UserReadDto dto) {
        return new User(dto.getId(), dto.getName(), dto.getEmail());
    }

    public UserReadDto toReadDto(User user) {
        return new UserReadDto(user.getId(), user.getName(), user.getEmail());
    }
    public UserReadDto toReadDto(UserCreateDto user, Long id) {
        return new UserReadDto(id, user.getName(), user.getEmail());
    }
}
