package org.salpa.shareit.dto.user;

import lombok.Value;

@Value
public class UserReadDto {
    Long id;
    String name;
    String email;
}
