package org.salpa.shareit.repository;

import org.salpa.shareit.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
